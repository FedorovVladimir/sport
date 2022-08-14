package ru.crabs.sport

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Weight : NavigationItem("Weight", R.drawable.ic_menu_weight, "Вес")
    object May : NavigationItem("May", R.drawable.ic_menu_task_alt, "Можно")
    object Cannot : NavigationItem("Cannot", R.drawable.ic_menu_dangerous, "Нельзя")
}
