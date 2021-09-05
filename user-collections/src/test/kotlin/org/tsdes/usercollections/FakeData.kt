package org.tsdes.usercollections

import org.tsdes.cards.dto.CardDto
import org.tsdes.cards.dto.CollectionDto
import org.tsdes.cards.dto.Rarity

object FakeData {

    fun getCollectionDto() : CollectionDto{
        val dto = CollectionDto()

        dto.prices[Rarity.BRONZE] = 100
        dto.prices[Rarity.SILVER] = 500
        dto.prices[Rarity.GOLD] = 1_000
        dto.prices[Rarity.PLATINUM] = 100_00

        dto.prices.forEach{ dto.millValues[it.key] = it.value / 4 }
        dto.prices.keys.forEach{ dto.rarityProbabilities[it] = 0.25 }

        dto.cards.run {
            add(CardDto(cardId = "c00", rarity = Rarity.BRONZE))
            add(CardDto(cardId = "c01", rarity = Rarity.BRONZE))
            add(CardDto(cardId = "c02", rarity = Rarity.BRONZE))
            add(CardDto(cardId = "c03", rarity = Rarity.BRONZE))
            add(CardDto(cardId = "c04", rarity = Rarity.SILVER))
            add(CardDto(cardId = "c05", rarity = Rarity.SILVER))
            add(CardDto(cardId = "c06", rarity = Rarity.SILVER))
            add(CardDto(cardId = "c07", rarity = Rarity.GOLD))
            add(CardDto(cardId = "c08", rarity = Rarity.GOLD))
            add(CardDto(cardId = "c09", rarity = Rarity.PLATINUM))
        }
        return dto
    }
}