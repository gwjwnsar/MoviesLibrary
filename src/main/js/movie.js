import React from 'react';
import Director from './director';
import Actors from './actors';

class Movie extends React.Component {
	render() {
		
		return (
			<tr>
				<td>{this.props.movie.name}</td>
				<td>{this.props.movie.rDate}</td>
				<td>{this.props.movie.genre}</td>
				<td><img src={this.props.movie.cImUrl} width="50px" height="60px" alt={this.props.movie.name} /> </td>
				<td><Director durl={this.props.movie._links.director.href} /></td>
				<td><Actors aurl={this.props.movie._links.actors.href} /></td>
			</tr>
		);
	}
}

export default Movie;