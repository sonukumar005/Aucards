package vadimerenkov.aucards

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import vadimerenkov.aucards.data.Aucard

@Composable
fun CreateStarters(): List<Aucard> {
	return listOf(
		Aucard(
			0,
			stringResource(R.string.yes),
			color = Color.Green
		),
		Aucard(
			0,
			stringResource(R.string.no),
			color = Color(-50334)
		),
		Aucard(
			0,
			stringResource(R.string.help),
			color = Color(-25612)
		),
		Aucard(
			0,
			stringResource(R.string.hug),
			color = Color.Cyan
		),
		Aucard(
			0,
			stringResource(R.string.alone),
			color = Color.Yellow
		)
	)
}