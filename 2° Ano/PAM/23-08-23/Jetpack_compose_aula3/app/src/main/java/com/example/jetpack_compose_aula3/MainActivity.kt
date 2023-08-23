package com.example.jetpack_compose_aula3

import android.content.res.Configuration
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_aula3.ui.theme.Jetpack_compose_aula3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_compose_aula3Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MessageCard(Message("Android", "Jetpack Compose"))
                    Conversation(SampleData.conversationSample)
                }
            }
        }

        @Preview(
            name = "Light Mode"
        )
        @Preview(
            uiMode = Configuration.UI_MODE_NIGHT_YES,
            showBackground = true,
            name = "Dark Mode"
        )

    }


    data class Message(val autor: String, val body: String)

    @Composable
    fun Conversation(messages: List<android.os.Message>) {
        LazyColumn {
            items(messages) { message ->
                MessageCard(message)
            }
        }
    }

    @Composable
    fun MessageCard(msg: Message) {
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = painterResource(R.drawable.pinguim),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            var isExpanded by remember { mutableStateOf(false) }

            val surfaceColor by animateColorAsState(
                if (isExpanded) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface,
            )

            Column(modifier = Modifier.clickable { isExpanded != isExpanded }) {
                Text(
                    text = msg.autor,
                    color = MaterialTheme.colors.secondaryVariant,
                    style = MaterialTheme.typography.subtitle2
                )
                Spacer(modifier = Modifier.height(4.dp))
                Surface(
                    shape = MaterialTheme.shapes.medium,
                    elevation = 1.dp,
                    color = surfaceColor,
                    modifier = Modifier
                        .animateContentSize()
                        .padding(1.dp)
                ) {
                    Text(
                        text = msg.body,
                        modifier = Modifier.padding(all = 4.dp),
                        maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }

    @Preview
    @Composable
    fun PreviewMessageCard() {
        MessageCard(msg = Message("Android", "Jetpack Compose"))
    }

    @Preview
    @Composable
    fun PreviewConversation() {
        Jetpack_compose_aula3Theme {
            Conversation(SampleData.conversationSample)
        }
    }
}