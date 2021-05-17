package org.autotest1_0

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commission() {
        val newTransfer = 15000
        val oldTransfer = "6000"
        val card = "Visa"


        val result = commission(
            inputNewTransfer = newTransfer,
            inputOldTransfer = oldTransfer,
            inputCard = card
        )

        assertEquals("�������� ���������� 11250 ������", result)
    }

    @Test
    fun commission1() {
        val newTransfer = 16000

        val result = commission(
            inputNewTransfer = newTransfer
        )

        assertEquals("����� �������� �������� ��������� 15000 ������. �������� ���������!", result)
    }

    @Test
    fun commission2() {
        val newTransfer = 20000
        val oldTransfer = "620000"
        val card = "Master"


        val result = commission(
            inputNewTransfer = newTransfer,
            inputOldTransfer = oldTransfer,
            inputCard = card
        )

        assertEquals("����� ������ ����� �������� �� ����� ��������� 600 000 ������.", result)
    }

    @Test
    fun commission3() {
        val newTransfer = 10000

        val result = commission(
            inputNewTransfer = newTransfer
        )

        assertEquals("�������� ���������� 0 ������. ", result)
    }

    @Test
    fun commission4() {
        val newTransfer = 40000
        val oldTransfer = "100000"
        val card = "Maestro"


        val result = commission(
            inputNewTransfer = newTransfer,
            inputOldTransfer = oldTransfer,
            inputCard = card
        )

        assertEquals("26000", result)
    }

    @Test
    fun commission5() {
        val newTransfer = 40000
        val oldTransfer = "100000"
        val card = "Master"


        val result = commission(
            inputNewTransfer = newTransfer,
            inputOldTransfer = oldTransfer,
            inputCard = card
        )

        assertEquals("26000", result)
    }

    @Test
    fun commission6() {
        val newTransfer = 10000
        val oldTransfer = "10000"

        val result = commission(
            inputNewTransfer = newTransfer,
            inputOldTransfer = oldTransfer
        )

        assertEquals("�������� ���������� 0 ������. ", result)

    }

    @Test
    fun commission7() {
        val newTransfer = 1000
        val oldTransfer = "1000"
        val card = "Visa"


        val result = commission(
            inputNewTransfer = newTransfer,
            inputOldTransfer = oldTransfer,
            inputCard = card
        )

        assertEquals("�������� ���������� 3500 ������", result)
    }
    @Test
    fun commission8() {
        val newTransfer = 1000
        val card = "Visa"


        val result = commission(
            inputNewTransfer = newTransfer,
            inputCard = card
        )

        assertEquals("�������� ���������� 3500 ������", result)
    }
}