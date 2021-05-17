package org.autotest1_0

fun main() {
    println(commission(15000,"6000", "Visa"))

}

fun commission(inputNewTransfer: Int, inputOldTransfer: String? = "0", inputCard: String? = "VK"): String? {

    return when{
        inputCard == "VK" && inputNewTransfer >15000 ->"����� �������� �������� ��������� 15000 ������. �������� ���������!"
        inputCard == "VK" && (inputNewTransfer + Integer.parseInt(inputOldTransfer)) > 45000 ->"����� ����� �������� �� ����� ��������� 45000 ������. �������� ���������!"
        (inputCard == "Master" || inputCard == "Maestro" || inputCard == "���" || inputCard == "Visa" ) && (Integer.parseInt(inputOldTransfer) + inputNewTransfer > 600000) -> "����� ������ ����� �������� �� ����� ��������� 600 000 ������."
        (inputCard == "Master" || inputCard == "Maestro") && (75000 < Integer.parseInt(inputOldTransfer) + inputNewTransfer &&  Integer.parseInt(inputOldTransfer) + inputNewTransfer < 600000) -> String.format("%.0f",(inputNewTransfer/100*0.6 + 20)*100)
        (inputCard == "Visa" || inputCard == "���") && inputNewTransfer/100*0.75 < 35 ->"�������� ���������� " + 35*100 + " ������"
        (inputCard == "Visa" || inputCard == "���") && inputNewTransfer/100*0.75 > 35 -> "�������� ���������� " + String.format("%.0f",inputNewTransfer/100*0.75*100) + " ������"

        else -> "�������� ���������� 0 ������. "
    }
}