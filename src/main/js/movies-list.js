import React from 'react';
import Movie from './movie';

class MoviesList extends React.Component {
	
	render() {
		let movies = this.props.movies.map(movie => {
			return <Movie key={movie._links.self.href} movie={movie} /> ;
		});
		return (
			<table>
				<tbody>
					<tr>
						<th>Name</th>
						<th>Release Date</th>
						<th>Genre</th>
						<th>Cover Image</th>
						<th>Director</th>
						<th>Actors</th>
					</tr>
					{movies}
				</tbody>
			</table>
		);
	}
}

export default MoviesList;