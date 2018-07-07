import React from 'react';

class Director extends React.Component {
	constructor(props) {
		super(props);
		this.state = {
				name: ""
		};
	}
	componentDidMount() {
		fetch(this.props.durl)
		.then((resp) => resp.json())
		.then(data => {
			this.setState({name: data.name});
		})
		.catch(e => {
			alert(e.message);
		});
	}
	render() {
		return <p>{this.state.name}</p>;
	}
}

export default Director;