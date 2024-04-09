package com.test.navigationdrawerapplication

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Created by Chandan Jana on 23-08-2023.
 * Company name: Mindteck
 * Email: chandan.jana@mindteck.com
 */
data class MenuItem(
    val id: String,
    val title: String,
    val contentDescription: String,
    val icon: ImageVector
)