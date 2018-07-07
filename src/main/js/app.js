import React from 'react';
import ReactDOM from 'react-dom';
import MoviesList from './movies-list';

class App extends React.Component  {
	
	constructor(props) {
		super(props);
		this.state = {
				movies: []
		};
	}
	
	componentDidMount() {
		fetch('http://localhost:8080/api/movies')
		.then((resp) => resp.json())
		.then(data => {
			this.setState({movies: data._embedded.movies});
		})
		.catch(e => {
			alert(e.message);
		});
	}
	
	render() {
		return <MoviesList movies={this.state.movies} />;
	}
}

ReactDOM.render(<App />, document.getElementById('app'));