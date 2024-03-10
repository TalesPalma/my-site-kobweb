package com.talespalma.mysite.pages

import androidx.compose.runtime.Composable
import com.talespalma.mysite.Values.ValuesColors
import com.talespalma.mysite.Values.ValuesTexts
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


@Page
@Composable
fun HomePage() {

    Surface(modifier = Modifier.background(ValuesColors.backgroundColor)
        .fillMaxSize()
        .padding(10.px)
    ) {
        Column(
            Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpanText(
                text = ValuesTexts.titleAboutMe,
                modifier = Modifier
                    .color(Color("white"))
                    .fontSize(30.px)
                    .fontWeight(700)
            )
            Box(
                Modifier
                    .background(color = ValuesColors.cardColors)
                    .padding(30.px)
                    .width(50.percent)
                    .height(90.percent)
                    .borderRadius(10.px)
            ) {
                //Text color white about me
                SpanText(text = ValuesTexts.textAboutMe, modifier = Modifier.color(Color("white")))
            }
        }
    }
}
