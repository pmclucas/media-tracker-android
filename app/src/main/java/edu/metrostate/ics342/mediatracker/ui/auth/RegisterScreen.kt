package edu.metrostate.ics342.mediatracker.ui.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SecureTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.sensitiveContent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.metrostate.ics342.mediatracker.theme.MediaTrackerTheme
import edu.metrostate.ics342.mediatracker.R
import edu.metrostate.ics342.mediatracker.theme.OnPrimaryContainer
import edu.metrostate.ics342.mediatracker.theme.OnSurface
import edu.metrostate.ics342.mediatracker.theme.PrimaryContainer


@Composable
fun RegisterScreen(
    onRegisterSuccess: () -> Unit,
    onNavigateToLogin: () -> Unit
) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        verticalArrangement   = Arrangement.Center,
        horizontalAlignment   = Alignment.CenterHorizontally

    ) {
    Image(
        painterResource(id = R.drawable.smart_display),
        contentDescription = "Application Icon",
        modifier = Modifier.size(width = 64.dp, height = 64.dp)
            .background(color = PrimaryContainer, shape = RoundedCornerShape(12.dp))
            .padding(all = 12.dp),
        colorFilter = ColorFilter.tint(color = OnPrimaryContainer)
    )
        //TODO: Update text fields with strings.xml
        Text("Create Account")
        Text("Join the community")
        TextField(
            state = TextFieldState(),
            modifier = Modifier,
            placeholder = {Text("Display Name")},
        )
        TextField(
            state = TextFieldState(),
            modifier = Modifier,
            placeholder = {Text("Username")},
        )
        TextField(
            state = TextFieldState(),
            modifier = Modifier,
            placeholder = {Text("Email")},
        )
        SecureTextField(
            state = TextFieldState(),
            modifier = Modifier,
            placeholder = {Text("Password")}
        )
        SecureTextField(
            state = TextFieldState(),
            modifier = Modifier,
            placeholder = {Text("Confirm Password")}
        )
        Button( onClick = {}) {
            Text("Sign Up")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun RegisterScreenPreview() {
    MediaTrackerTheme {
        RegisterScreen(
            onRegisterSuccess = {},
            onNavigateToLogin = {}
        )
    }
}
