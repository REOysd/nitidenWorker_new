package com.example.nitidenworker_new.common.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.sharp.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nitidenworker_new.R
import com.example.nitidenworker_new.core.extention.topBarBorderColor

@Composable
fun HomeTopBar(
    onClickToProfile: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
//            .statusBarsPadding()
            .height(60.dp)
            .background(Color.White)
            .drawWithContent {
                drawContent()
                drawLine(
                    color = MaterialTheme.topBarBorderColor,
                    start = Offset(0f, size.height),
                    end = Offset(size.width, size.height),
                    strokeWidth = 2.dp.toPx()
                )
            }
    ) {
        Image(
            painter = painterResource(id = R.drawable.nitiiden_icon),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
        )
        Spacer(
            modifier = Modifier
                .weight(1f)
        )
        IconButton(
            onClick = { },
            modifier = Modifier
                .size(30.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.Notifications,
                contentDescription = stringResource(R.string.TopBar_Notification_Icon_contentDescription),
                modifier = Modifier
                    .size(28.dp),
            )
        }
        Spacer(modifier = Modifier.width(13.dp))
        IconButton(
            onClick = {
                onClickToProfile()
            },
            modifier = Modifier
                .padding(end = 10.dp)
                .size(30.dp)
        ) {
            Icon(
                imageVector = Icons.Sharp.AccountCircle,
                contentDescription = stringResource(R.string.TopBar_Profile_icon_contentDescripton),
                modifier = Modifier
                    .size(28.dp),
                tint = Color.DarkGray
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenTopBarPreview() {
    HomeTopBar(onClickToProfile = {})
}