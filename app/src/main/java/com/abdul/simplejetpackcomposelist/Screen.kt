package com.abdul.simplejetpackcomposelist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(heightDp = 500)
@Composable
fun PreviewItem() {
    //BlogCategory(img = R.drawable.a, title = "Programming", subTitle = "Learn Different Programming")
    LazyColumn(content = {
        items(getCategoryList()) { item ->
            BlogCategory(img = item.img, title = item.title, subTitle = item.subTitle)
        }
    })
}

@Composable
fun BlogCategory(img: Int, title: String, subTitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .weight(.2f) // Align 20% space of Row
            )
            ItemDescription(title, subTitle, modifier = Modifier.weight(.8f))
        } // Ends Row()
    }
}

@Composable
private fun ItemDescription(title: String, subTitle: String, modifier: Modifier) {
    Column(modifier = modifier) {// Align 80% space of Row
        Text(
            text = title,
            // fontWeight = FontWeight.Bold
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = subTitle,
            //fontWeight = FontWeight.Thin,
            //fontSize = 12.sp
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Thin
        )
    }
}

// Create a data class
data class Category(val img: Int, val title: String, val subTitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.a, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.b, "Technology", " News about new Tech"))
    list.add(Category(R.drawable.c, "Full Stack Developer", "From Backend to Frontend"))
    list.add(Category(R.drawable.d, "Android Developer", "Must Have kotlin & Java Knowledge"))
    list.add(Category(R.drawable.e, "Flutter Developer", "Learn Dart Languages"))
    list.add(Category(R.drawable.a, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.b, "Technology", " News about new Tech"))
    list.add(Category(R.drawable.c, "Full Stack Developer", "From Backend to Frontend"))
    list.add(Category(R.drawable.d, "Android Developer", "Must Have kotlin & Java Knowledge"))
    list.add(Category(R.drawable.e, "Flutter Developer", "Learn Dart Languages"))
    list.add(Category(R.drawable.a, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.b, "Technology", " News about new Tech"))
    list.add(Category(R.drawable.c, "Full Stack Developer", "From Backend to Frontend"))
    list.add(Category(R.drawable.d, "Android Developer", "Must Have kotlin & Java Knowledge"))
    list.add(Category(R.drawable.e, "Flutter Developer", "Learn Dart Languages"))
    list.add(Category(R.drawable.a, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.b, "Technology", " News about new Tech"))
    list.add(Category(R.drawable.c, "Full Stack Developer", "From Backend to Frontend"))
    list.add(Category(R.drawable.d, "Android Developer", "Must Have kotlin & Java Knowledge"))
    list.add(Category(R.drawable.e, "Flutter Developer", "Learn Dart Languages"))
    return list
}