package org.tsdes.usercollections.dto

import io.swagger.annotations.ApiModelProperty

data class UserDto (
        @get:ApiModelProperty("The id of the user")
        var userId: String? = null,

        @get:ApiModelProperty("The amount of coins by the user")
        var coins: Int? = null,

        @get:ApiModelProperty("The number of un-opened cards packs by the user")
        var cardsPacks:Int? = null,

        @get:ApiModelProperty("List of cards owned by the user")
        var ownedCards:MutableList<CardCopyDto> = mutableListOf()

)