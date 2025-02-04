package com.example.static_music_player_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.material3.Icon
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.static_music_player_ui.ui.theme.StaticmusicplayeruiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StaticmusicplayeruiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MusicPlayerScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MusicPlayerScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // lays out the album cover, texts, and buttons vertically.
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // album cover
            Image(
                painter = painterResource(id = R.drawable.album_cover),
                contentDescription = "Album Cover",
                modifier = Modifier.size(200.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            // song title
            Text(
                text = "Timeless",
                style = MaterialTheme.typography.headlineSmall // headline styling
            )
            // artist name
            Text(
                text = "The Weeknd (feat. Playboi Carti)",
                style = MaterialTheme.typography.bodyMedium // body text styling
            )
            Spacer(modifier = Modifier.height(16.dp))
            // control buttons
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // static media buttons - no action
                // using system default icons for media buttons
                Button(onClick = {}) {
                    Icon(
                        painter = painterResource(id = android.R.drawable.ic_media_pause),
                        contentDescription = "Pause"
                    )
                }

                Button(onClick = {}) {
                    Icon(
                        painter = painterResource(id = android.R.drawable.ic_media_play),
                        contentDescription = "Play"
                    )
                }
                Button(onClick = {}) {
                    Icon(
                        painter = painterResource(id = android.R.drawable.ic_media_next),
                        contentDescription = "Play Next"
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StaticmusicplayeruiTheme {
    }
}