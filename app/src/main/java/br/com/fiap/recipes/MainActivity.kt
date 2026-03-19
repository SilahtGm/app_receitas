    package br.com.fiap.recipes

    import android.content.res.Configuration
    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.activity.enableEdgeToEdge
    import androidx.compose.foundation.BorderStroke
    import androidx.compose.foundation.Image
    import androidx.compose.foundation.background
    import androidx.compose.foundation.layout.*
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.material3.Button
    import androidx.compose.material3.ButtonDefaults
    import androidx.compose.material3.Card
    import androidx.compose.material3.CardDefaults
    import androidx.compose.material3.MaterialTheme
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.res.stringResource
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import br.com.fiap.recipes.ui.theme.RecipesTheme
    import br.com.fiap.recipes.ui.theme.poppinsFamily


    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContent {
                RecipesTheme {
                    InitialScreen()
                }

            }
        }
    }

    @Composable
    fun InitialScreen() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.background)
        ) {
            Card(
                modifier = Modifier
                    .size(width = 160.dp, height = 85.dp)
                    .align(Alignment.TopEnd),
                colors = CardDefaults
                    .cardColors(
                        containerColor = MaterialTheme.colorScheme.primary
                    ),
                shape = RoundedCornerShape(bottomStart = 85.dp)
            ) { }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 48.dp, vertical = 16.dp)
                    .align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.cooking),
                    contentDescription = "Image of someone cooking",
                    modifier = Modifier.size(190.dp)
                )
                Spacer(modifier = Modifier.height(100.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(R.string.unlimited_recipes),
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.secondary
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = stringResource(R.string.app_title),
                        fontSize = 64.sp,
                        style = MaterialTheme.typography.displayLarge,
                        color = MaterialTheme.colorScheme.primary

                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Row {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme
                                    .colorScheme.primary
                            ),
                            border = BorderStroke(
                                width = 1.dp,
                                color = MaterialTheme
                                    .colorScheme.tertiary
                            ),
                            modifier = Modifier
                                .size(128.dp, 48.dp)
                        ) {
                            Text(
                                text = stringResource(R.string.button_login),
                                color = MaterialTheme.colorScheme.onPrimary,
                                style = MaterialTheme.typography.labelMedium
                            )
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme
                                    .colorScheme.tertiary
                            ),
                            border = BorderStroke(
                                width = 1.dp,
                                color = MaterialTheme.colorScheme.primary
                            ),
                            modifier = Modifier
                                .size(width = 128.dp, height = 48.dp)
                        ) {
                            Text(
                                text = stringResource(R.string.button_signup),
                                color = MaterialTheme
                                    .colorScheme.onTertiary,
                                style = MaterialTheme.typography.labelMedium
                            )
                        }
                    }
                }
            }
            Card(
                modifier = Modifier
                    .size(width = 160.dp, height = 85.dp)
                    .align(Alignment.BottomStart),
                colors = CardDefaults
                    .cardColors(containerColor = MaterialTheme
                        .colorScheme.primary),
                shape = RoundedCornerShape(topEnd = 85.dp)
            ) { }
        }
    }

    @Preview(
        showBackground = true,
    )
    // uiMode = Configuration.UI_MODE_NIGHT_YES
    @Composable
    fun InitialScreenPreview() {
        RecipesTheme {
            InitialScreen()
        }
    }