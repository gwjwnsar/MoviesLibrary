import React from 'react';
import Actor from './actor';

class Actors extends React.Component {
	constructor(props) {
		super(props);
		this.state = {
				actors: []
		};
	}
	componentDidMount() {
		fetch(this.props.aurl)
		.then((resp) => resp.json())
		.then(data => {
			this.setState({actors: data._embedded.actors});
		})
		.catch(e => {
			alert(e.message);
		});
	}
	render() {
		let actorsC = this.state.actors.map(actor => {
			return <Actor key={actor._links.self.href} name={actor.name} />;
		});
		return (
			<ul>
				{actorsC}
			</ul>
		);
	}
}

export default Actors;