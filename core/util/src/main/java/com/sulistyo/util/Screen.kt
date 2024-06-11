package com.sulistyo.util

import com.sulistyo.util.Constant.WRITE_SCREEN_ARGUMENT_ID


sealed class Screen(val route: String) {
    object Authentication : Screen(route = "authentication_screen")
    object Home : Screen(route = "home_screen")
    object Write : Screen(
        route = "write_screen?$WRITE_SCREEN_ARGUMENT_ID=" +
                "{$WRITE_SCREEN_ARGUMENT_ID}"
    ) {
        fun pastDiaryId(diaryId: String) = "write_screen?$WRITE_SCREEN_ARGUMENT_ID=$diaryId"
    }
}
