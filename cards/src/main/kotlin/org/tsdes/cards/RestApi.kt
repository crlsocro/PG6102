package org.tsdes.cards

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.http.CacheControl
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.tsdes.cards.dto.CollectionDto
import org.tsdes.rests.dto.WrappedResponse
import java.util.concurrent.TimeUnit

@Api(value = "/api/cards", description = "Operations for cards")
@RequestMapping(path = ["api/cards"])
@RestController
class RestApi{
    companion object{
        const val LATEST ="v1_000"
    }

    @ApiOperation("Return info on all the cards in the game")
    @GetMapping(
        path = ["/collection_$LATEST"],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun getLatest(): ResponseEntity<WrappedResponse<CollectionDto>>{

        val collection = CardCollection.get()

        return ResponseEntity
            .status(200)
            .cacheControl(CacheControl.maxAge(365, TimeUnit.DAYS).cachePublic())
            .body(WrappedResponse(200, collection).validated())




    }
}