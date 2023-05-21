package com.example.quadrant

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant() {
    QuadrantSection()
}

@Composable
fun QuadrantSection() {
    Column(
        modifier = Modifier.fillMaxWidth()

    ) {
        Row(
            modifier = Modifier
                .weight(1f),

            ) {
            QuadrantCard(
                title = stringResource(R.string.q1_title),
                body = stringResource(R.string.q1_body),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            QuadrantCard(
                title = stringResource(R.string.q2_title),
                body = stringResource(R.string.q1_body),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier
                .weight(1f),

            ) {
            QuadrantCard(
                title = stringResource(R.string.q3_title),
                body = stringResource(R.string.q3_body),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            QuadrantCard(
                title = stringResource(R.string.q4_title),
                body = stringResource(R.string.q4_body),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantCard(title: String, body: String, backgroundColor: Color, modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = body, textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        Quadrant()
    }
}