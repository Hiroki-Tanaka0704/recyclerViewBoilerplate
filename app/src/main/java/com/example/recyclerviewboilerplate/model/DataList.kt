package com.example.recyclerviewboilerplate.model

class DataList (val name: String) {

    companion object {

        private var lastUserId = 0

        fun createContactList(userCounts: Int) : ArrayList<DataList> {
            val contacts = ArrayList<DataList>()
            for (i in 1..userCounts) {
                contacts.add(
                    DataList(
                        "User" + ++lastUserId
                    )
                )
            }
            return contacts
        }

    }

}