import React from 'react';

class Actor extends React.Component {
	render(){
		return <li>{this.props.name}</li>;
	}
}

export default Actor;