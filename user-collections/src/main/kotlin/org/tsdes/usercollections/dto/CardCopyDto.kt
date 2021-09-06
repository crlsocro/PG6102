package org.tsdes.usercollections.dto

import io.swagger.annotations.ApiModelProperty

data class CardCopyDto (
        @get:ApiModelProperty("Id of the cards")
        var cardId: String? = null,

        @get:ApiModelProperty("Number of copies of the cards that user owns")
        var numberOfCopies: Int? = null
        )