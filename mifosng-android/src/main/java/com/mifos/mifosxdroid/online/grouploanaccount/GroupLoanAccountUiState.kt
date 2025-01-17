package com.mifos.mifosxdroid.online.grouploanaccount

import com.mifos.objects.accounts.loan.Loans
import com.mifos.objects.organisation.LoanProducts
import com.mifos.objects.templates.loans.GroupLoanTemplate

/**
 * Created by Aditya Gupta on 12/08/23.
 */
sealed class GroupLoanAccountUiState {

    object ShowProgressbar : GroupLoanAccountUiState()

    data class ShowFetchingError(val message: String) : GroupLoanAccountUiState()

    data class ShowAllLoans(val productLoans: List<LoanProducts>) : GroupLoanAccountUiState()

    data class ShowGroupLoanTemplate(val groupLoanTemplate: GroupLoanTemplate) :
        GroupLoanAccountUiState()

    data class ShowGroupLoansAccountCreatedSuccessfully(val loans: Loans) :
        GroupLoanAccountUiState()


}