package com.example.recyclerviewboilerplate.model

class DataList (val name: String) {

    companion object {

        private var lastUserId = 0

        fun createUsersList(userCounts: Int) : ArrayList<DataList> {
            val users = ArrayList<DataList>()
            for (i in 1..userCounts) {
                users.add(
                    DataList(
                        "User" + ++lastUserId
                    )
                )
            }
            return users
        }

    }

}