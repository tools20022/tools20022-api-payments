/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of product or financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmTermLoan
 * FinancialInstrumentProductTypeCode.mmTermLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmRevolverLoan
 * FinancialInstrumentProductTypeCode.mmRevolverLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmRevolverTermLoan
 * FinancialInstrumentProductTypeCode.mmRevolverTermLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmBridgeLoan
 * FinancialInstrumentProductTypeCode.mmBridgeLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmLetterOfCredit
 * FinancialInstrumentProductTypeCode.mmLetterOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmSwingLineFacilityLoan
 * FinancialInstrumentProductTypeCode.mmSwingLineFacilityLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmDebtorInPossession
 * FinancialInstrumentProductTypeCode.mmDebtorInPossession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmDefaultedLoan
 * FinancialInstrumentProductTypeCode.mmDefaultedLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmWithdrawnLoan
 * FinancialInstrumentProductTypeCode.mmWithdrawnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmReplacedLoan
 * FinancialInstrumentProductTypeCode.mmReplacedLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmMaturedLoan
 * FinancialInstrumentProductTypeCode.mmMaturedLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmAmendedRestatedLoan
 * FinancialInstrumentProductTypeCode.mmAmendedRestatedLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmRetiredLoan
 * FinancialInstrumentProductTypeCode.mmRetiredLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmBradyBond
 * FinancialInstrumentProductTypeCode.mmBradyBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmUSTreasuryBond
 * FinancialInstrumentProductTypeCode.mmUSTreasuryBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmSTRIPS
 * FinancialInstrumentProductTypeCode.mmSTRIPS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmTreasuryInflationProtectedSecurity
 * FinancialInstrumentProductTypeCode.mmTreasuryInflationProtectedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmPrincipalStripCallableBond
 * FinancialInstrumentProductTypeCode.mmPrincipalStripCallableBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmPrincipalStripNonCallableBond
 * FinancialInstrumentProductTypeCode.mmPrincipalStripNonCallableBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmUSTreasuryNote
 * FinancialInstrumentProductTypeCode.mmUSTreasuryNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmUSTreasuryBill
 * FinancialInstrumentProductTypeCode.mmUSTreasuryBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmCommonStock
 * FinancialInstrumentProductTypeCode.mmCommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmPreferredStock
 * FinancialInstrumentProductTypeCode.mmPreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmNoSecurityType
 * FinancialInstrumentProductTypeCode.mmNoSecurityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmMutualFund
 * FinancialInstrumentProductTypeCode.mmMutualFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmMultiLeg
 * FinancialInstrumentProductTypeCode.mmMultiLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmForeignExchangeContract
 * FinancialInstrumentProductTypeCode.mmForeignExchangeContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmOtherAnticipationNote
 * FinancialInstrumentProductTypeCode.mmOtherAnticipationNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmCertificateOfObligation
 * FinancialInstrumentProductTypeCode.mmCertificateOfObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmCertificateOfParticipation
 * FinancialInstrumentProductTypeCode.mmCertificateOfParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmGeneralObligationBond
 * FinancialInstrumentProductTypeCode.mmGeneralObligationBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmMandatoryTender
 * FinancialInstrumentProductTypeCode.mmMandatoryTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmRevenueAnticipationNote
 * FinancialInstrumentProductTypeCode.mmRevenueAnticipationNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmRevenueBond
 * FinancialInstrumentProductTypeCode.mmRevenueBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmSpecialAssessmentMunicipalBond
 * FinancialInstrumentProductTypeCode.mmSpecialAssessmentMunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmSpecialObligation
 * FinancialInstrumentProductTypeCode.mmSpecialObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmSpecialTax
 * FinancialInstrumentProductTypeCode.mmSpecialTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmTaxAnticipationNote
 * FinancialInstrumentProductTypeCode.mmTaxAnticipationNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmTaxAllocation
 * FinancialInstrumentProductTypeCode.mmTaxAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmTaxExemptCommercialPaper
 * FinancialInstrumentProductTypeCode.mmTaxExemptCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmTaxRevenueAnticipationNote
 * FinancialInstrumentProductTypeCode.mmTaxRevenueAnticipationNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmVariableRateDemandNote
 * FinancialInstrumentProductTypeCode.mmVariableRateDemandNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmWarrant
 * FinancialInstrumentProductTypeCode.mmWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmAgencyPool
 * FinancialInstrumentProductTypeCode.mmAgencyPool}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmAssetBackedBond
 * FinancialInstrumentProductTypeCode.mmAssetBackedBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmCollateralisedMortgageSecurity
 * FinancialInstrumentProductTypeCode.mmCollateralisedMortgageSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmCorporateMortgageBackedSecurity
 * FinancialInstrumentProductTypeCode.mmCorporateMortgageBackedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmIOETTEMortgage
 * FinancialInstrumentProductTypeCode.mmIOETTEMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmMortgageBackedSecurity
 * FinancialInstrumentProductTypeCode.mmMortgageBackedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmMortgageInterestOnly
 * FinancialInstrumentProductTypeCode.mmMortgageInterestOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmMortgagePrincipalOnly
 * FinancialInstrumentProductTypeCode.mmMortgagePrincipalOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmMortgagePrivatePlacement
 * FinancialInstrumentProductTypeCode.mmMortgagePrivatePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmMiscellaneousPassThrough
 * FinancialInstrumentProductTypeCode.mmMiscellaneousPassThrough}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmToBeAnnouncedMortgage
 * FinancialInstrumentProductTypeCode.mmToBeAnnouncedMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmFederalAgencyCoupon
 * FinancialInstrumentProductTypeCode.mmFederalAgencyCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmFederalAgencyDiscountNote
 * FinancialInstrumentProductTypeCode.mmFederalAgencyDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmPrivateExportFunding
 * FinancialInstrumentProductTypeCode.mmPrivateExportFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmBankersAcceptance
 * FinancialInstrumentProductTypeCode.mmBankersAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmBankNote
 * FinancialInstrumentProductTypeCode.mmBankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmBillOfExchange
 * FinancialInstrumentProductTypeCode.mmBillOfExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmCertificateOfDeposit
 * FinancialInstrumentProductTypeCode.mmCertificateOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmCallLoan
 * FinancialInstrumentProductTypeCode.mmCallLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmCommercialPaper
 * FinancialInstrumentProductTypeCode.mmCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmDepositNote
 * FinancialInstrumentProductTypeCode.mmDepositNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmLiquidityNote
 * FinancialInstrumentProductTypeCode.mmLiquidityNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmMediumTermNote
 * FinancialInstrumentProductTypeCode.mmMediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmOvernightDeposit
 * FinancialInstrumentProductTypeCode.mmOvernightDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmPromissoryNote
 * FinancialInstrumentProductTypeCode.mmPromissoryNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmRepurchaseAgreement
 * FinancialInstrumentProductTypeCode.mmRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmReverseRepurchaseAgreement
 * FinancialInstrumentProductTypeCode.mmReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmShortTermLoanNote
 * FinancialInstrumentProductTypeCode.mmShortTermLoanNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmTimeDeposit
 * FinancialInstrumentProductTypeCode.mmTimeDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmExtendedCommercialNote
 * FinancialInstrumentProductTypeCode.mmExtendedCommercialNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmCorporateBond
 * FinancialInstrumentProductTypeCode.mmCorporateBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmCorporatePrivatePlacement
 * FinancialInstrumentProductTypeCode.mmCorporatePrivatePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmConvertibleBond
 * FinancialInstrumentProductTypeCode.mmConvertibleBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmDualCurrencyBond
 * FinancialInstrumentProductTypeCode.mmDualCurrencyBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmIndexedLinkedCorporateBond
 * FinancialInstrumentProductTypeCode.mmIndexedLinkedCorporateBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmStructuredNote
 * FinancialInstrumentProductTypeCode.mmStructuredNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmYankeeCorporateBond
 * FinancialInstrumentProductTypeCode.mmYankeeCorporateBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmAssetBackedCommercialPaper
 * FinancialInstrumentProductTypeCode.mmAssetBackedCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmFloatingRateNote
 * FinancialInstrumentProductTypeCode.mmFloatingRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmOtherShortTermDebtSecurities
 * FinancialInstrumentProductTypeCode.mmOtherShortTermDebtSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmCallAccountCallMoney
 * FinancialInstrumentProductTypeCode.mmCallAccountCallMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#mmDeposit
 * FinancialInstrumentProductTypeCode.mmDeposit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"TERM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentProductTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of product or financial instrument."</li>
 * </ul>
 */
public class FinancialInstrumentProductTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Business loan, usually fixed or variable, for an extended term of up to
	 * 10 years. A term loan generally provides an agreed upon payment schedule
	 * with the amounts paid not able to be re-borrowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TERM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TermLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business loan, usually fixed or variable, for an extended term of up to 10 years. A term loan generally provides an agreed upon payment schedule with the amounts paid not able to be re-borrowed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTermLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TermLoan";
			definition = "Business loan, usually fixed or variable, for an extended term of up to 10 years. A term loan generally provides an agreed upon payment schedule with the amounts paid not able to be re-borrowed.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Loan that allows the borrower to borrow, repay and re-borrow, as needed
	 * over the life of the loan facility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVLV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevolverLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Loan that allows the borrower to borrow, repay and re-borrow, as needed over the life of the loan facility."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRevolverLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RevolverLoan";
			definition = "Loan that allows the borrower to borrow, repay and re-borrow, as needed over the life of the loan facility.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "RVLV";
		}
	};
	/**
	 * Outstanding loan amount in a revolving loan facility that may fluctuate
	 * on a daily basis. A revolver allows the borrower to borrow, repay, and
	 * re-borrow as needed over the life of the loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTLV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevolverTermLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Outstanding loan amount in a revolving loan facility that may fluctuate on a daily basis. A revolver allows the borrower to borrow, repay, and re-borrow as needed over the life of the loan."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRevolverTermLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RevolverTermLoan";
			definition = "Outstanding loan amount in a revolving loan facility that may fluctuate on a daily basis. A revolver allows the borrower to borrow, repay, and re-borrow as needed over the life of the loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "RTLV";
		}
	};
	/**
	 * Interim financing used to solidify a position until permanent financing
	 * is secured. It is also called a swing loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BridgeLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interim financing used to solidify a position until permanent financing is secured. It is also called a swing loan."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBridgeLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BridgeLoan";
			definition = "Interim financing used to solidify a position until permanent financing is secured. It is also called a swing loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "BRID";
		}
	};
	/**
	 * Instrument issued by a bank substituting its name and credit standing for
	 * that of its customer. A letter of credit is a written undertaking of the
	 * bank, issued for the account of a customer (the applicant), to honour a
	 * demand for payment, upon the beneficiary's compliance with the terms and
	 * conditions set forth in the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOFC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument issued by a bank substituting its name and credit standing for that of its customer. A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLetterOfCredit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Instrument issued by a bank substituting its name and credit standing for that of its customer. A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "LOFC";
		}
	};
	/**
	 * Credit facility allowing a borrower to bridge time gaps that might occur
	 * due to switching the loan from domestic borrowing to international
	 * borrowing (or vice versa), or switching the type of loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwingLineFacilityLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit facility allowing a borrower to bridge time gaps that might occur due to switching the loan from domestic borrowing to international borrowing (or vice versa), or switching the type of loan."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSwingLineFacilityLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwingLineFacilityLoan";
			definition = "Credit facility allowing a borrower to bridge time gaps that might occur due to switching the loan from domestic borrowing to international borrowing (or vice versa), or switching the type of loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "SWIN";
		}
	};
	/**
	 * Firm that continues to operate under the Chapter 11 bankruptcy policy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DINP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorInPossession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Firm that continues to operate under the Chapter 11 bankruptcy policy."</li>
	 * </ul>
	 */
	public static final MMCode mmDebtorInPossession = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebtorInPossession";
			definition = "Firm that continues to operate under the Chapter 11 bankruptcy policy.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "DINP";
		}
	};
	/**
	 * Failure to make timely payments of interest or principal on a debt
	 * security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultedLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Failure to make timely payments of interest or principal on a debt security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDefaultedLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefaultedLoan";
			definition = "Failure to make timely payments of interest or principal on a debt security.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Loan that is disbursed against a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawnLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loan that is disbursed against a security."</li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawnLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithdrawnLoan";
			definition = "Loan that is disbursed against a security.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Loan that has been paid or replaced by a new loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReplacedLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loan that has been paid or replaced by a new loan."</li>
	 * </ul>
	 */
	public static final MMCode mmReplacedLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReplacedLoan";
			definition = "Loan that has been paid or replaced by a new loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "REPL";
		}
	};
	/**
	 * Outstanding debt instrument that has reached final maturity and can no
	 * longer earn interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MATU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturedLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Outstanding debt instrument that has reached final maturity and can no longer earn interest."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMaturedLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaturedLoan";
			definition = "Outstanding debt instrument that has reached final maturity and can no longer earn interest.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MATU";
		}
	};
	/**
	 * Loan agreement that results in a new loan after the restructuring of an
	 * existing loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendedRestatedLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Loan agreement that results in a new loan after the restructuring of an existing loan."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAmendedRestatedLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmendedRestatedLoan";
			definition = "Loan agreement that results in a new loan after the restructuring of an existing loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "AMEN";
		}
	};
	/**
	 * Loan that is no longer performing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RETR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetiredLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loan that is no longer performing."</li>
	 * </ul>
	 */
	public static final MMCode mmRetiredLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RetiredLoan";
			definition = "Loan that is no longer performing.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "RETR";
		}
	};
	/**
	 * Series of sovereign bonds issued by several developing countries in
	 * exchange for their rescheduled bank loans. A brady bond is defaulted
	 * emerging market debt that is traded at a discount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BradyBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Series of sovereign bonds issued by several developing countries in exchange for their rescheduled bank loans. A brady bond is defaulted emerging market debt that is traded at a discount."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBradyBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BradyBond";
			definition = "Series of sovereign bonds issued by several developing countries in exchange for their rescheduled bank loans. A brady bond is defaulted emerging market debt that is traded at a discount.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "BRAD";
		}
	};
	/**
	 * Security that pays a fixed rate of interest every six months until
	 * maturity, when the investor receives payment for the par value of the
	 * security. Treasury notes mature in more than a year, but no more than 10
	 * years from the issue date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TBON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security that pays a fixed rate of interest every six months until maturity, when the investor receives payment for the par value of the security. Treasury notes mature in more than a year, but no more than 10 years from the issue date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUSTreasuryBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USTreasuryBond";
			definition = "Security that pays a fixed rate of interest every six months until maturity, when the investor receives payment for the par value of the security. Treasury notes mature in more than a year, but no more than 10 years from the issue date.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TBON";
		}
	};
	/**
	 * Separate Trading of Registered Interest and Principal of Securities.
	 * STRIPS are also called zero-coupon securities, because the only time an
	 * investor receives a payment during the life of a STRIP is when it
	 * matures. The STRIPS program lets investors hold and trade the individual
	 * interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TINT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "STRIPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Separate Trading of Registered Interest and Principal of Securities.  STRIPS are also called zero-coupon securities, because the only time an investor receives a payment during the life of a STRIP is when it matures. The STRIPS program lets investors hold and trade the individual interest."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSTRIPS = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "STRIPS";
			definition = "Separate Trading of Registered Interest and Principal of Securities.  STRIPS are also called zero-coupon securities, because the only time an investor receives a payment during the life of a STRIP is when it matures. The STRIPS program lets investors hold and trade the individual interest.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TINT";
		}
	};
	/**
	 * 5, 10, or 30 year US Treasuries for which the interest rate, set at
	 * auction, remains fixed throughout the term of the security. The principal
	 * amount of the security is adjusted for inflation, though the inflation
	 * adjusted principal will not be paid until maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryInflationProtectedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "5, 10, or 30 year US Treasuries for which the interest rate, set at auction, remains fixed throughout the term of the security. The principal amount of the security is adjusted for inflation, though the inflation adjusted principal will not be paid until maturity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTreasuryInflationProtectedSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasuryInflationProtectedSecurity";
			definition = "5, 10, or 30 year US Treasuries for which the interest rate, set at auction, remains fixed throughout the term of the security. The principal amount of the security is adjusted for inflation, though the inflation adjusted principal will not be paid until maturity.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TIPS";
		}
	};
	/**
	 * Principal strip portion of a bond with a call provision.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TCAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalStripCallableBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Principal strip portion of a bond with a call provision."</li>
	 * </ul>
	 */
	public static final MMCode mmPrincipalStripCallableBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrincipalStripCallableBond";
			definition = "Principal strip portion of a bond with a call provision.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TCAL";
		}
	};
	/**
	 * Principal strip of a bullet bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TPRN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalStripNonCallableBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Principal strip of a bullet bond."</li>
	 * </ul>
	 */
	public static final MMCode mmPrincipalStripNonCallableBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrincipalStripNonCallableBond";
			definition = "Principal strip of a bullet bond.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TPRN";
		}
	};
	/**
	 * Bonds that mature more than 10 years from their issue date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bonds that mature more than 10 years from their issue date."</li>
	 * </ul>
	 */
	public static final MMCode mmUSTreasuryNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USTreasuryNote";
			definition = "Bonds that mature more than 10 years from their issue date.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "USTN";
		}
	};
	/**
	 * Short-term securities that mature in one year or less from their issue
	 * date, and are sold at a price less than their par (face) value. A US
	 * Treasury Bill is also called a T-Bill.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USTB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USTreasuryBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Short-term securities that mature in one year or less from their issue date, and are sold at a price less than their par (face) value.  A US Treasury Bill is also called a T-Bill."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUSTreasuryBill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USTreasuryBill";
			definition = "Short-term securities that mature in one year or less from their issue date, and are sold at a price less than their par (face) value.  A US Treasury Bill is also called a T-Bill.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "USTB";
		}
	};
	/**
	 * Units representing equity ownership in a public company. Common stock
	 * also gives the holder voting rights, profits via dividends or capital
	 * appreciation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Units representing equity ownership in a public company. Common stock also gives the holder voting rights, profits via dividends or capital appreciation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCommonStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommonStock";
			definition = "Units representing equity ownership in a public company. Common stock also gives the holder voting rights, profits via dividends or capital appreciation.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Class of capital stock that pays dividends at a specific rate and has
	 * preference over common stock in divident payments and asset liquidation.
	 * Preferred stock does not usually carry voting rights. It has the
	 * characteristics of both common stock and debt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Class of capital stock that pays dividends at a specific rate and has preference over common stock in divident payments and asset liquidation. Preferred stock does not usually carry voting rights. It has the characteristics of both common stock and debt."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPreferredStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreferredStock";
			definition = "Class of capital stock that pays dividends at a specific rate and has preference over common stock in divident payments and asset liquidation. Preferred stock does not usually carry voting rights. It has the characteristics of both common stock and debt.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "PREF";
		}
	};
	/**
	 * No security type specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSecurityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No security type specified."</li>
	 * </ul>
	 */
	public static final MMCode mmNoSecurityType = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoSecurityType";
			definition = "No security type specified.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "NONE";
		}
	};
	/**
	 * Investment fund operated by an investment company. Mutual funds are pools
	 * of money that are managed by an investment company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MFUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MutualFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund operated by an investment company. Mutual funds are pools of money that are managed by an investment company."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMutualFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MutualFund";
			definition = "Investment fund operated by an investment company. Mutual funds are pools of money that are managed by an investment company.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MFUN";
		}
	};
	/**
	 * Derivative security or strategy where the "deal" is composed of
	 * constituent securities, yet are to be thought of as one deal or
	 * transaction, eg, bond swap, straddle or strangle. A more common asset,
	 * which is multileg by definition, is a currency or an interest rate swap.
	 * Some deals can have more than one leg, eg, a butterfly spread.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLEG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Derivative security or strategy where the \"deal\" is composed of constituent securities, yet are to be thought of as one deal or transaction, eg, bond swap, straddle or strangle. A more common asset, which is multileg by definition, is a currency or an interest rate swap. Some deals can have more than one leg, eg, a butterfly spread."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMultiLeg = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultiLeg";
			definition = "Derivative security or strategy where the \"deal\" is composed of constituent securities, yet are to be thought of as one deal or transaction, eg, bond swap, straddle or strangle. A more common asset, which is multileg by definition, is a currency or an interest rate swap. Some deals can have more than one leg, eg, a butterfly spread.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MLEG";
		}
	};
	/**
	 * Legally binding agreement to buy or sell a commodity, eg, foreign
	 * currency, or financial instrument in a designated future month at a price
	 * agreed upon today by the buyer and seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FXCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legally binding agreement to buy or sell a commodity, eg, foreign currency, or financial instrument in a designated future month at a price agreed upon today by the buyer and seller."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForeignExchangeContract = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeContract";
			definition = "Legally binding agreement to buy or sell a commodity, eg, foreign currency, or financial instrument in a designated future month at a price agreed upon today by the buyer and seller.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "FXCO";
		}
	};
	/**
	 * Anticipation note other than Tax Anticipation Notes or Revenue
	 * Anticipation Notes, eg, grants and education notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAnticipationNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Anticipation note other than Tax Anticipation Notes or Revenue Anticipation Notes, eg, grants and education notes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOtherAnticipationNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherAnticipationNote";
			definition = "Anticipation note other than Tax Anticipation Notes or Revenue Anticipation Notes, eg, grants and education notes.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "ANNO";
		}
	};
	/**
	 * Long-term debt issued by a city.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Long-term debt issued by a city."</li>
	 * </ul>
	 */
	public static final MMCode mmCertificateOfObligation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateOfObligation";
			definition = "Long-term debt issued by a city.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "COFO";
		}
	};
	/**
	 * Structure where investors buy certificates that entitle them to receive a
	 * participation or share in the lease payments from a particular project.
	 * The lease payments are passed through the lessor to the certificate
	 * holders with the tax advantages intact. The lessor typically assigns the
	 * lease and lease payments to a trustee, then distributes the lease
	 * payments to the certificate holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COFP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfParticipation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Structure where investors buy certificates that entitle them to receive a participation or share in the lease payments from a particular project. The lease payments are passed through the lessor to the certificate holders with the tax advantages intact. The lessor typically assigns the lease and lease payments to a trustee, then distributes the lease payments to the certificate holders."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCertificateOfParticipation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateOfParticipation";
			definition = "Structure where investors buy certificates that entitle them to receive a participation or share in the lease payments from a particular project. The lease payments are passed through the lessor to the certificate holders with the tax advantages intact. The lessor typically assigns the lease and lease payments to a trustee, then distributes the lease payments to the certificate holders.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "COFP";
		}
	};
	/**
	 * Municipal securities secured by the issuer's pledge of its full faith,
	 * credit, and taxing power.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GOBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralObligationBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Municipal securities secured by the issuer's pledge of its full faith, credit, and taxing power."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmGeneralObligationBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GeneralObligationBond";
			definition = "Municipal securities secured by the issuer's pledge of its full faith, credit, and taxing power.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "GOBO";
		}
	};
	/**
	 * Sinking fund feature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sinking fund feature."</li>
	 * </ul>
	 */
	public static final MMCode mmMandatoryTender = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandatoryTender";
			definition = "Sinking fund feature.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MTEN";
		}
	};
	/**
	 * Financial instruments issued in anticipation of other sources of future
	 * revenue, other than taxes. This may include intergovernmental aid. The
	 * interest is usually tax-free to the security holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RANO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevenueAnticipationNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments issued in anticipation of other sources of future revenue, other than taxes. This may include intergovernmental aid. The interest is usually tax-free to the security holder."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRevenueAnticipationNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RevenueAnticipationNote";
			definition = "Financial instruments issued in anticipation of other sources of future revenue, other than taxes. This may include intergovernmental aid. The interest is usually tax-free to the security holder.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "RANO";
		}
	};
	/**
	 * Bond issued by a municipality to finance either a project or an
	 * enterprise. The issuer pledges to the bondholders that the debt service
	 * is payable solely by the revenues generated by the operation of the
	 * projects financed, a category of facilities, or from another non-tax
	 * source.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REVB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevenueBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bond issued by a municipality to finance either a project or an enterprise.  The issuer pledges to the bondholders that the debt service is payable solely by the revenues generated by the operation of the projects financed, a category of facilities, or from another non-tax source."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRevenueBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RevenueBond";
			definition = "Bond issued by a municipality to finance either a project or an enterprise.  The issuer pledges to the bondholders that the debt service is payable solely by the revenues generated by the operation of the projects financed, a category of facilities, or from another non-tax source.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "REVB";
		}
	};
	/**
	 * Municipal bond with interest paid by the taxes of the community
	 * benefiting from the bond funded project.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialAssessmentMunicipalBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Municipal bond with interest paid by the taxes of the community benefiting from the bond funded project."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSpecialAssessmentMunicipalBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialAssessmentMunicipalBond";
			definition = "Municipal bond with interest paid by the taxes of the community benefiting from the bond funded project.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "SPCA";
		}
	};
	/**
	 * Municipal bond with interest paid by the taxes of the community
	 * benefiting from the bond funded project.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Municipal bond with interest paid by the taxes of the community benefiting from the bond funded project."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSpecialObligation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialObligation";
			definition = "Municipal bond with interest paid by the taxes of the community benefiting from the bond funded project.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "SPCO";
		}
	};
	/**
	 * Bond secured by a special tax, eg, gasoline tax or other excise tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bond secured by a special tax, eg, gasoline tax or other excise tax."</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialTax = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialTax";
			definition = "Bond secured by a special tax, eg, gasoline tax or other excise tax.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "SPCT";
		}
	};
	/**
	 * Notes issued by states or municipalities to finance current operations in
	 * anticipation of future tax receipts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TANO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAnticipationNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notes issued by states or municipalities to finance current operations in anticipation of future tax receipts."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTaxAnticipationNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxAnticipationNote";
			definition = "Notes issued by states or municipalities to finance current operations in anticipation of future tax receipts.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TANO";
		}
	};
	/**
	 * Notes payable with a collection of taxes earmarked for repayment of the
	 * notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notes payable with a collection of taxes earmarked for repayment of the notes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTaxAllocation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxAllocation";
			definition = "Notes payable with a collection of taxes earmarked for repayment of the notes.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TAXA";
		}
	};
	/**
	 * Short-term promissory note issued for periods of up to 270 days, often
	 * used in lieu of Tax Anticipation Notes and Revenue Anticipation Notes
	 * because of the greater flexibility offered in setting both maturities and
	 * determining rates. A bond usually issued by municipal, county or state
	 * governments whose interest payments are not subject to federal and, in
	 * some cases, state and local income tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TECP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemptCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Short-term promissory note issued for periods of up to 270 days, often used in lieu of Tax Anticipation Notes and Revenue Anticipation Notes because of the greater flexibility offered in setting both maturities and determining rates. A bond usually issued by municipal, county or state governments whose interest payments are not subject to federal and, in some cases, state and local income tax."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTaxExemptCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxExemptCommercialPaper";
			definition = "Short-term promissory note issued for periods of up to 270 days, often used in lieu of Tax Anticipation Notes and Revenue Anticipation Notes because of the greater flexibility offered in setting both maturities and determining rates. A bond usually issued by municipal, county or state governments whose interest payments are not subject to federal and, in some cases, state and local income tax.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TECP";
		}
	};
	/**
	 * Notes that are issued by states or municipalities to finance current
	 * operations in anticipation of future tax receipts or other expected
	 * revenues.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRevenueAnticipationNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notes that are issued by states or municipalities to finance current operations in anticipation of future tax receipts or other expected revenues."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTaxRevenueAnticipationNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRevenueAnticipationNote";
			definition = "Notes that are issued by states or municipalities to finance current operations in anticipation of future tax receipts or other expected revenues.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Bond that bears interest at a variable or floating rate established at
	 * specified intervals, eg, flexible or monthly. A variable rate demand note
	 * contains a put option permitting the bondholder to tender the bond for
	 * purchase when a new interest rate is established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VRDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateDemandNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bond that bears interest at a variable or floating rate established at specified intervals, eg, flexible or monthly. A variable rate demand note contains a put option permitting the bondholder to tender the bond for purchase when a new interest rate is established."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVariableRateDemandNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableRateDemandNote";
			definition = "Bond that bears interest at a variable or floating rate established at specified intervals, eg, flexible or monthly. A variable rate demand note contains a put option permitting the bondholder to tender the bond for purchase when a new interest rate is established.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "VRDN";
		}
	};
	/**
	 * The right to buy a specified amount of shares at a pre-determined price
	 * and time. A warrant is similar to call options, but much longer time
	 * spans can extend to warrants that are offered by corporations, while
	 * exchange-traded call options are not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The right to buy a specified amount of shares at a pre-determined price and time. A warrant is similar to call options, but much longer time spans can extend to warrants that are offered by corporations, while exchange-traded call options are not."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWarrant = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Warrant";
			definition = "The right to buy a specified amount of shares at a pre-determined price and time. A warrant is similar to call options, but much longer time spans can extend to warrants that are offered by corporations, while exchange-traded call options are not.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "WARR";
		}
	};
	/**
	 * Collection of mortgages that have been securitised. The shares or
	 * participation certificates in the pool are sold to investors called
	 * mortgage pass-throughs. In order to securitise loans and attenuate risk
	 * in the mortgage market, a security is created when one or more mortgage
	 * holders form a collection pool of mortgages and sells shares or
	 * participation certificates in the pool. The cash flow from the collateral
	 * pool is "passed through" to the security holder as monthly payments of
	 * principal, interest and pre-payments.
	 * 
	 * .
	 * 
	 * .
	 * 
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgencyPool"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of mortgages that have been securitised. The shares or participation certificates in the pool are sold to investors called mortgage pass-throughs. In order to securitise loans and attenuate risk in the mortgage market, a security is created when one or more mortgage holders form a collection pool of mortgages and sells shares or participation certificates in the pool. The cash flow from the collateral pool is \"passed through\" to the security holder as monthly payments of principal, interest and pre-payments.\n\n.\n\n.\n\n."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAgencyPool = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgencyPool";
			definition = "Collection of mortgages that have been securitised. The shares or participation certificates in the pool are sold to investors called mortgage pass-throughs. In order to securitise loans and attenuate risk in the mortgage market, a security is created when one or more mortgage holders form a collection pool of mortgages and sells shares or participation certificates in the pool. The cash flow from the collateral pool is \"passed through\" to the security holder as monthly payments of principal, interest and pre-payments.\n\n.\n\n.\n\n.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "APOL";
		}
	};
	/**
	 * Bond that is collateralised by loans, leases or installment contracts on
	 * personal property, but not real estate. Asset backed bonds are usually
	 * receivables such as credit card receivables, home-equity loans,
	 * manufactured homes loans and automobile loans.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetBackedBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bond that is collateralised by loans, leases or installment contracts on personal property, but not real estate. Asset backed bonds are usually receivables such as credit card receivables, home-equity loans, manufactured homes loans and automobile loans."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAssetBackedBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetBackedBond";
			definition = "Bond that is collateralised by loans, leases or installment contracts on personal property, but not real estate. Asset backed bonds are usually receivables such as credit card receivables, home-equity loans, manufactured homes loans and automobile loans.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "ABBO";
		}
	};
	/**
	 * Security backed by a pool of pass-throughs or a pool of mortgage loans.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedMortgageSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security backed by a pool of pass-throughs or a pool of mortgage loans."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollateralisedMortgageSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralisedMortgageSecurity";
			definition = "Security backed by a pool of pass-throughs or a pool of mortgage loans.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CMOS";
		}
	};
	/**
	 * Mortgage backed security whose cash flows are backed by major property
	 * mortgages, eg, office space, retail property or hotels. Corporate
	 * mortgage backed securities are also called commercial mortgage-backed
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateMortgageBackedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mortgage backed security whose cash flows are backed by major property mortgages, eg, office space, retail property or hotels. Corporate mortgage backed securities are also called commercial mortgage-backed securities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCorporateMortgageBackedSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateMortgageBackedSecurity";
			definition = "Mortgage backed security whose cash flows are backed by major property mortgages, eg, office space, retail property or hotels. Corporate mortgage backed securities are also called commercial mortgage-backed securities.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CMBS";
		}
	};
	/**
	 * Interest only (IO) tranche in a collateralized mortgage obligation (CMO).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IETM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IOETTEMortgage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest only (IO) tranche in a collateralized mortgage obligation (CMO)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIOETTEMortgage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IOETTEMortgage";
			definition = "Interest only (IO) tranche in a collateralized mortgage obligation (CMO).";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "IETM";
		}
	};
	/**
	 * Instrument whose cash flow depends on the cash flows of an underlying
	 * pool of mortgages. Mortgage backed securities are usually residential
	 * mortgages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageBackedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument whose cash flow depends on the cash flows of an underlying pool of mortgages. Mortgage backed securities are usually residential mortgages."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMortgageBackedSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MortgageBackedSecurity";
			definition = "Instrument whose cash flow depends on the cash flows of an underlying pool of mortgages. Mortgage backed securities are usually residential mortgages.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MOBS";
		}
	};
	/**
	 * Security whose cash flow is from the interest payments of the underlying
	 * collateral, and is based solely on the interest component from a pool of
	 * mortgages or other bonds. When the principal on the mortgages or bonds
	 * has been repaid, interest payments stop and the value of the interest
	 * only (IO) falls to zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOIO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageInterestOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security whose cash flow is from the interest payments of the underlying collateral, and is based solely on the interest component from a pool of mortgages or other bonds. When the principal on the mortgages or bonds has been repaid, interest payments stop and the value of the interest only (IO) falls to zero."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMortgageInterestOnly = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MortgageInterestOnly";
			definition = "Security whose cash flow is from the interest payments of the underlying collateral, and is based solely on the interest component from a pool of mortgages or other bonds. When the principal on the mortgages or bonds has been repaid, interest payments stop and the value of the interest only (IO) falls to zero.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MOIO";
		}
	};
	/**
	 * Security whose cash flow is from the principal payments of the underlying
	 * collateral. Mortgage principal only is a mortgage backed security (MBS)
	 * where the holder receives only principal cash flows on the underlying
	 * mortgage pool. All the principal distribution due from the underlying
	 * collateral pool is paid to the registered holder of the stripped MBS on
	 * the basis of the current face value of the underlying collateral pool.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgagePrincipalOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security whose cash flow is from the principal payments of the underlying collateral. Mortgage principal only is a mortgage backed security (MBS) where the holder receives only principal cash flows on the underlying mortgage pool. All the principal distribution due from the underlying collateral pool is paid to the registered holder of the stripped MBS on the basis of the current face value of the underlying collateral pool."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMortgagePrincipalOnly = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MortgagePrincipalOnly";
			definition = "Security whose cash flow is from the principal payments of the underlying collateral. Mortgage principal only is a mortgage backed security (MBS) where the holder receives only principal cash flows on the underlying mortgage pool. All the principal distribution due from the underlying collateral pool is paid to the registered holder of the stripped MBS on the basis of the current face value of the underlying collateral pool.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MOPO";
		}
	};
	/**
	 * Contract between a lender and a property owner that provides a loan
	 * defining the property as collateral. A mortgage private placement
	 * involves the issuance of a security to a group of no more than 35
	 * investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MPRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgagePrivatePlacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract between a lender and a property owner that provides a loan defining the property as collateral. A mortgage private placement involves the issuance of a security to a group of no more than 35 investors."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMortgagePrivatePlacement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MortgagePrivatePlacement";
			definition = "Contract between a lender and a property owner that provides a loan defining the property as collateral. A mortgage private placement involves the issuance of a security to a group of no more than 35 investors.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MPRP";
		}
	};
	/**
	 * Security created when one or more mortgage holders form a collection
	 * (pool) of mortgages and sell shares or participation certificates in the
	 * pool. The cash flow from the collateral pool is "passed through" to the
	 * security holder as monthly payments of principal, interest, and
	 * prepayments. A miscellaneous pass through is also called a passthrough.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousPassThrough"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security created when one or more mortgage holders form a collection (pool) of mortgages and sell shares or participation certificates in the pool. The cash flow from the collateral pool is \"passed through\" to the security holder as monthly payments of principal, interest, and prepayments.  A miscellaneous pass through is also called a passthrough."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMiscellaneousPassThrough = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MiscellaneousPassThrough";
			definition = "Security created when one or more mortgage holders form a collection (pool) of mortgages and sell shares or participation certificates in the pool. The cash flow from the collateral pool is \"passed through\" to the security holder as monthly payments of principal, interest, and prepayments.  A miscellaneous pass through is also called a passthrough.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "MIPT";
		}
	};
	/**
	 * Contract for the purchase or sale of a mortgage backed security to be
	 * delivered at an agreed-upon future date. A To Be Announced (TBA) Mortgage
	 * does not include a specified pool number, number of pools or the precise
	 * amount to be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeAnnouncedMortgage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract for the purchase or sale of a mortgage backed security to be delivered at an agreed-upon future date.  A To Be Announced (TBA) Mortgage does not include a specified pool number, number of pools or the precise amount to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmToBeAnnouncedMortgage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ToBeAnnouncedMortgage";
			definition = "Contract for the purchase or sale of a mortgage backed security to be delivered at an agreed-upon future date.  A To Be Announced (TBA) Mortgage does not include a specified pool number, number of pools or the precise amount to be delivered.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TOBA";
		}
	};
	/**
	 * Fixed income coupon security issued by a federal agency, eg, the
	 * Tennessee Valley Authority, or a government sponsored enterprise, eg,
	 * FreddieMac.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalAgencyCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed income coupon security issued by a federal agency, eg, the Tennessee Valley Authority, or a government sponsored enterprise, eg, FreddieMac."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFederalAgencyCoupon = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FederalAgencyCoupon";
			definition = "Fixed income coupon security issued by a federal agency, eg, the Tennessee Valley Authority, or a government sponsored enterprise, eg, FreddieMac.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "FEAC";
		}
	};
	/**
	 * Fixed income discounted notes issued by a federal agency, eg, the
	 * Tennessee Valley Authority, or a government-sponsored enterprise, eg,
	 * FreddieMac. Discount notes are unsecured general corporate obligations
	 * that are issued at a discount and mature at par. Agency discount notes
	 * give institutional and retail investors convenient choices with regard to
	 * the investment date, maturity date and size of their short-term
	 * investments. Maturities of discount notes can range from overnight
	 * through one year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalAgencyDiscountNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed income discounted notes issued by a federal agency, eg, the Tennessee Valley Authority, or a government-sponsored enterprise, eg, FreddieMac. Discount notes are unsecured general corporate obligations that are issued at a discount and mature at par. Agency discount notes give institutional and retail investors convenient choices with regard to the investment date, maturity date and size of their short-term investments. Maturities of discount notes can range from overnight through one year."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFederalAgencyDiscountNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FederalAgencyDiscountNote";
			definition = "Fixed income discounted notes issued by a federal agency, eg, the Tennessee Valley Authority, or a government-sponsored enterprise, eg, FreddieMac. Discount notes are unsecured general corporate obligations that are issued at a discount and mature at par. Agency discount notes give institutional and retail investors convenient choices with regard to the investment date, maturity date and size of their short-term investments. Maturities of discount notes can range from overnight through one year.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "FEAD";
		}
	};
	/**
	 * Private capital for financing the export of big ticket items by U.S.
	 * firms. Private export funding is done by purchasing the medium to
	 * long-term debt of importers of U.S. products at fixed interest rates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivateExportFunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Private capital for financing the export of big ticket items by U.S. firms. Private export funding is done by purchasing the medium to long-term debt of importers of U.S. products at fixed interest rates."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPrivateExportFunding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrivateExportFunding";
			definition = "Private capital for financing the export of big ticket items by U.S. firms. Private export funding is done by purchasing the medium to long-term debt of importers of U.S. products at fixed interest rates.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "PRIV";
		}
	};
	/**
	 * Time draft drawn upon and accepted by a bank, as well as the customary
	 * means of effecting payment for merchandise sold in import-export
	 * transactions. A Bankers Acceptance is a source of financing used
	 * extensively in international trade. With the credit strength of a bank
	 * behind it, the banker's acceptance usually qualifies as a money market
	 * instrument. The liability assumed by the bank is called its acceptance
	 * liability.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BAAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankersAcceptance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time draft drawn upon and accepted by a bank, as well as the customary means of effecting payment for merchandise sold in import-export transactions. A Bankers Acceptance is a source of financing used extensively in international trade. With the credit strength of a bank behind it, the banker's acceptance usually qualifies as a money market instrument. The liability assumed by the bank is called its acceptance liability."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBankersAcceptance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankersAcceptance";
			definition = "Time draft drawn upon and accepted by a bank, as well as the customary means of effecting payment for merchandise sold in import-export transactions. A Bankers Acceptance is a source of financing used extensively in international trade. With the credit strength of a bank behind it, the banker's acceptance usually qualifies as a money market instrument. The liability assumed by the bank is called its acceptance liability.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "BAAP";
		}
	};
	/**
	 * Securities that are exempt from registration under section 3(a)2 of the
	 * Securities Act 1933, and that have characteristics in common with
	 * certificates of deposit (CDs), medium term notes (MTNs) and short-term
	 * bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BANT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities that are exempt from registration under section 3(a)2 of the Securities Act 1933, and that have characteristics in common with certificates of deposit (CDs), medium term notes (MTNs) and short-term bonds."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBankNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankNote";
			definition = "Securities that are exempt from registration under section 3(a)2 of the Securities Act 1933, and that have characteristics in common with certificates of deposit (CDs), medium term notes (MTNs) and short-term bonds.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "BANT";
		}
	};
	/**
	 * Written order from one party (the drawer) to another (the drawee) to pay
	 * a specified sum upon demand, or on a specified date, to the drawer or to
	 * a third party specified by the drawer. A bill of exchange is also called
	 * a draft.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIOX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillOfExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Written order from one party (the drawer) to another (the drawee) to pay a specified sum upon demand, or on a specified date, to the drawer or to a third party specified by the drawer. A bill of exchange is also called a draft."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBillOfExchange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillOfExchange";
			definition = "Written order from one party (the drawer) to another (the drawee) to pay a specified sum upon demand, or on a specified date, to the drawer or to a third party specified by the drawer. A bill of exchange is also called a draft.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "BIOX";
		}
	};
	/**
	 * Certificate issued by a bank or thrift that indicates a specified sum of
	 * money deposited. The certificate has a maturity date and a specified
	 * interest rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate issued by a bank or thrift that indicates a specified sum of money deposited. The certificate has a maturity date and a specified interest rate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCertificateOfDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateOfDeposit";
			definition = "Certificate issued by a bank or thrift that indicates a specified sum of money deposited. The certificate has a maturity date and a specified interest rate.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CEOD";
		}
	};
	/**
	 * Loan repayable on demand. A call loan is also known as a broker loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CALN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Loan repayable on demand. A call loan is also known as a broker loan."</li>
	 * </ul>
	 */
	public static final MMCode mmCallLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallLoan";
			definition = "Loan repayable on demand. A call loan is also known as a broker loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CALN";
		}
	};
	/**
	 * Short-term, unsecured promissory note issued by a corporation. The
	 * maturity is typically less than 270 days, with a most common maturity
	 * range of 30 to 50 days or less. Commercial paper is usually issued at a
	 * discount, though some are interest-bearing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Short-term, unsecured promissory note issued by a corporation. The maturity is typically less than 270 days, with a most common maturity range of 30 to 50 days or less. Commercial paper is usually issued at a discount, though some are interest-bearing."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialPaper";
			definition = "Short-term, unsecured promissory note issued by a corporation. The maturity is typically less than 270 days, with a most common maturity range of 30 to 50 days or less. Commercial paper is usually issued at a discount, though some are interest-bearing.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "COPR";
		}
	};
	/**
	 * Savings instrument issued by banks with a fixed interest rate, usually
	 * paid on a monthly basis, and a fixed maturity date. A deposit note has an
	 * optional call provision and is insured by the Federal Deposit Insurance
	 * Corporation (for U.S). It is sometimes called a Certificate of Deposit
	 * (CD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DENT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Savings instrument issued by banks with a fixed interest rate, usually paid on a monthly basis, and a fixed maturity date. A deposit note has an optional call provision and is insured by the Federal Deposit Insurance Corporation (for U.S). It is sometimes called a Certificate of Deposit (CD)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDepositNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositNote";
			definition = "Savings instrument issued by banks with a fixed interest rate, usually paid on a monthly basis, and a fixed maturity date. A deposit note has an optional call provision and is insured by the Federal Deposit Insurance Corporation (for U.S). It is sometimes called a Certificate of Deposit (CD).";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "DENT";
		}
	};
	/**
	 * Note that is easily and cheaply converted to cash, ie, cash itself and
	 * short-term products.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LINT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Note that is easily and cheaply converted to cash, ie, cash itself and short-term products."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLiquidityNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiquidityNote";
			definition = "Note that is easily and cheaply converted to cash, ie, cash itself and short-term products.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "LINT";
		}
	};
	/**
	 * Highly flexible debt instruments that can be easily structured in
	 * response to changing market conditions and investor tastes. The maturity
	 * ranges from 9 months to 30 years or more. Medium term notes are typically
	 * non-callable, unsecured senior debt with fixed-coupon rates that carry an
	 * investment grade credit rating. It is also a corporate debt instrument
	 * that is continuously offered to investors over a period of time by an
	 * agent of the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "METN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediumTermNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Highly flexible debt instruments that can be easily structured in response to changing market conditions and investor tastes. The maturity ranges from 9 months to 30 years or more. Medium term notes are typically non-callable, unsecured senior debt with fixed-coupon rates that carry an investment grade credit rating.  It is also a corporate debt instrument that is continuously offered to investors over a period of time by an agent of the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMediumTermNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MediumTermNote";
			definition = "Highly flexible debt instruments that can be easily structured in response to changing market conditions and investor tastes. The maturity ranges from 9 months to 30 years or more. Medium term notes are typically non-callable, unsecured senior debt with fixed-coupon rates that carry an investment grade credit rating.  It is also a corporate debt instrument that is continuously offered to investors over a period of time by an agent of the issuer.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "METN";
		}
	};
	/**
	 * Unsecured, offshore Eurodollar used by corporations for depositing cash
	 * flows overnight, usually deposited to a branch of a domestic bank. An
	 * overnight deposit is a facility to place short-term surplus funds with a
	 * bank, (generally central banks), at the end of the day while earning
	 * interest. The rate provides the floor for short-term money market rates.
	 * Due to a large minimum, banks offer overnight deposits primarily to large
	 * clients.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OvernightDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unsecured, offshore Eurodollar used by corporations for depositing cash flows overnight, usually deposited to a branch of a domestic bank. An overnight deposit is a facility to place short-term surplus funds with a bank, (generally central banks), at the end of the day while earning interest. The rate provides the floor for short-term money market rates. Due to a large minimum, banks offer overnight deposits primarily to large clients."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOvernightDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OvernightDeposit";
			definition = "Unsecured, offshore Eurodollar used by corporations for depositing cash flows overnight, usually deposited to a branch of a domestic bank. An overnight deposit is a facility to place short-term surplus funds with a bank, (generally central banks), at the end of the day while earning interest. The rate provides the floor for short-term money market rates. Due to a large minimum, banks offer overnight deposits primarily to large clients.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "OVNT";
		}
	};
	/**
	 * Written promise committing the maker to pay the payee a specified sum of
	 * money either on demand, or at a fixed determinable future date, with or
	 * without interest. The instruments meeting this criteria are negotiable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PromissoryNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Written promise committing the maker to pay the payee a specified sum of money either on demand, or at a fixed determinable future date, with or without interest. The instruments meeting this criteria are negotiable."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPromissoryNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PromissoryNote";
			definition = "Written promise committing the maker to pay the payee a specified sum of money either on demand, or at a fixed determinable future date, with or without interest. The instruments meeting this criteria are negotiable.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "PRNT";
		}
	};
	/**
	 * Agreement with a commitment by the seller (dealer) to buy a security back
	 * from the purchaser (customer) at a specified price and a designated
	 * future date. A repurchase agreement, or repo, represents a collateralised
	 * short-term loan where the collateral may be a treasury security, money
	 * market instrument, federal agency security or a mortgage-backed security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement with a commitment by the seller (dealer) to buy a security back from the purchaser (customer) at a specified price and a designated future date. A repurchase agreement, or repo, represents a collateralised short-term loan where the collateral may be a treasury security, money market instrument, federal agency security or a mortgage-backed security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Agreement with a commitment by the seller (dealer) to buy a security back from the purchaser (customer) at a specified price and a designated future date. A repurchase agreement, or repo, represents a collateralised short-term loan where the collateral may be a treasury security, money market instrument, federal agency security or a mortgage-backed security.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "REAM";
		}
	};
	/**
	 * Similar to a repurchase agreement, with the exception that it is from the
	 * purchaser's (customer's) perspective. Reverse repos offer the holders of
	 * fixed income securities a means of temporarily absorbing reserves by
	 * selling securities under an agreement to subsequently repurchase them. It
	 * offers the customer of the transaction the security as collateral to the
	 * loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RERA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Similar to a repurchase agreement, with the exception that it is from the purchaser's (customer's) perspective.  Reverse repos offer the holders of fixed income securities a means of temporarily absorbing reserves by selling securities under an agreement to subsequently repurchase them. It offers the customer of the transaction the security as collateral to the loan."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReverseRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReverseRepurchaseAgreement";
			definition = "Similar to a repurchase agreement, with the exception that it is from the purchaser's (customer's) perspective.  Reverse repos offer the holders of fixed income securities a means of temporarily absorbing reserves by selling securities under an agreement to subsequently repurchase them. It offers the customer of the transaction the security as collateral to the loan.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "RERA";
		}
	};
	/**
	 * Note with a term that is usually less than a year, but can be as long as
	 * two years.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermLoanNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Note with a  term that is usually less than a year, but can be as long as two years."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmShortTermLoanNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShortTermLoanNote";
			definition = "Note with a  term that is usually less than a year, but can be as long as two years.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "SHTN";
		}
	};
	/**
	 * Loan that accrues interest for a pre-set time, eg, a bank savings account
	 * or Certificate of Deposit (CD). Money is invested for a fixed period and
	 * earns an attractive return. A time deposit is usually offered with a
	 * range of investment amounts, maturities, and interest payment dates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Loan that accrues interest for a pre-set time, eg, a bank savings account or Certificate of Deposit (CD).  Money is invested for a fixed period and earns an attractive return. A time deposit is usually offered with a range of investment amounts, maturities, and interest payment dates."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTimeDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeDeposit";
			definition = "Loan that accrues interest for a pre-set time, eg, a bank savings account or Certificate of Deposit (CD).  Money is invested for a fixed period and earns an attractive return. A time deposit is usually offered with a range of investment amounts, maturities, and interest payment dates.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "TIDE";
		}
	};
	/**
	 * Unsecured commitment issued by a corporation to finance its short-term
	 * credit needs, with maturity dates being as short as two days and
	 * extending to a year. Extended commercial notes (CNs) are those with
	 * maturity dates extending beyond the committed dates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedCommercialNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unsecured commitment issued by a corporation to finance its short-term credit needs, with maturity dates being as short as two days and extending to a year. Extended commercial notes (CNs) are those with maturity dates extending beyond the committed dates."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExtendedCommercialNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExtendedCommercialNote";
			definition = "Unsecured commitment issued by a corporation to finance its short-term credit needs, with maturity dates being as short as two days and extending to a year. Extended commercial notes (CNs) are those with maturity dates extending beyond the committed dates.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "EXCN";
		}
	};
	/**
	 * Debt obligations issued by private corporations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debt obligations issued by private corporations."</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateBond";
			definition = "Debt obligations issued by private corporations.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Sale of bonds directly to an institutional investor, eg, an insurance
	 * company. Securities are purchased for investment, and are not to be
	 * resold to the public.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPPE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporatePrivatePlacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sale of bonds directly to an institutional investor, eg,  an insurance company. Securities are purchased for investment, and are not to be resold to the public."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCorporatePrivatePlacement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporatePrivatePlacement";
			definition = "Sale of bonds directly to an institutional investor, eg,  an insurance company. Securities are purchased for investment, and are not to be resold to the public.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CPPE";
		}
	};
	/**
	 * Bond that can be exchanged for specified amounts of common stock in the
	 * issuing firm. The conversion process cannot be reversed, and the
	 * conversion details are described in the bond's indenture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bond that can be exchanged for specified amounts of common stock in the issuing firm. The conversion process cannot be reversed, and the conversion details are described in the bond's indenture."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmConvertibleBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConvertibleBond";
			definition = "Bond that can be exchanged for specified amounts of common stock in the issuing firm. The conversion process cannot be reversed, and the conversion details are described in the bond's indenture.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Eurobonds that pay coupon interest in one currency and principal in a
	 * different currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DUAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DualCurrencyBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eurobonds that pay coupon interest in one currency and principal in a different currency."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDualCurrencyBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DualCurrencyBond";
			definition = "Eurobonds that pay coupon interest in one currency and principal in a different currency.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "DUAL";
		}
	};
	/**
	 * Bond issue that is inflation-indexed, whereas coupon payments are timed
	 * to an inflation index. Indexed linked corporate bond is a product whose
	 * valuation or cash flows is a function of an index, eg, sovereign bonds
	 * such as U.S. Treasuries or U.K. Gilts, whose coupon rate is adjusted
	 * periodically as a function of an inflation index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XLIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexedLinkedCorporateBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bond issue that is inflation-indexed, whereas coupon payments are timed to an inflation index. Indexed linked corporate bond is a product whose valuation or cash flows is a function of an index, eg, sovereign bonds such as U.S. Treasuries or U.K. Gilts, whose coupon rate is adjusted periodically as a function of an inflation index."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIndexedLinkedCorporateBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexedLinkedCorporateBond";
			definition = "Bond issue that is inflation-indexed, whereas coupon payments are timed to an inflation index. Indexed linked corporate bond is a product whose valuation or cash flows is a function of an index, eg, sovereign bonds such as U.S. Treasuries or U.K. Gilts, whose coupon rate is adjusted periodically as a function of an inflation index.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "XLIN";
		}
	};
	/**
	 * Note with an embedded derivative, eg, a synthetic-fixed rate note created
	 * by issuing a floating rate note while entering into a "plain vanilla"
	 * interest rate swap to offset the floating rate payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STRU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Note with an embedded derivative, eg, a synthetic-fixed rate note created by issuing a floating rate note while entering into a \"plain vanilla\" interest rate swap to offset the floating rate payments."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStructuredNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StructuredNote";
			definition = "Note with an embedded derivative, eg, a synthetic-fixed rate note created by issuing a floating rate note while entering into a \"plain vanilla\" interest rate swap to offset the floating rate payments.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "STRU";
		}
	};
	/**
	 * Dollar denominated bonds issued in the U.S. by foreign corporations,
	 * banks, and sovereigns that are sold in the U.S. market, eg, bonds issued
	 * by originators with roots in Japan are called Samurai bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YANK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YankeeCorporateBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dollar denominated bonds issued in the U.S. by foreign corporations, banks, and sovereigns that are sold in the U.S. market, eg, bonds issued by originators with roots in Japan are called Samurai bonds."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmYankeeCorporateBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YankeeCorporateBond";
			definition = "Dollar denominated bonds issued in the U.S. by foreign corporations, banks, and sovereigns that are sold in the U.S. market, eg, bonds issued by originators with roots in Japan are called Samurai bonds.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "YANK";
		}
	};
	/**
	 * Debt instrument issued by a financial institution which has a maturity of
	 * no more than one year, is either interest-bearing or discounted and is
	 * backed by some form of collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetBackedCommercialPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debt instrument issued by a financial institution which has a maturity of no more than one year, is either interest-bearing or discounted and is backed by some form of collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAssetBackedCommercialPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedCommercialPaper";
			definition = "Debt instrument issued by a financial institution which has a maturity of no more than one year, is either interest-bearing or discounted and is backed by some form of collateral.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "ABCP";
		}
	};
	/**
	 * Debt instrument in which the periodic interest payments are calculated on
	 * the basis of the value (fixing of an underlying reference rate such as
	 * the Euribor) on predefined dates (fixing dates) and which has a maturity
	 * of no more tha one year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatingRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debt instrument in which the periodic interest payments are calculated on the basis of the value (fixing of an underlying reference rate such as the Euribor) on predefined dates (fixing dates) and which has a maturity of no more tha one year."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFloatingRateNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateNote";
			definition = "Debt instrument in which the periodic interest payments are calculated on the basis of the value (fixing of an underlying reference rate such as the Euribor) on predefined dates (fixing dates) and which has a maturity of no more tha one year.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "FRNT";
		}
	};
	/**
	 * Other short term debt securities issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherShortTermDebtSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other short term debt securities issued."</li>
	 * </ul>
	 */
	public static final MMCode mmOtherShortTermDebtSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherShortTermDebtSecurities";
			definition = "Other short term debt securities issued.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Cash account with a notice period to withdraw money and that gives rise
	 * to interest payments or calculations at regular intervals, and daily
	 * change of the applicable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CACM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallAccountCallMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash account with a notice period to withdraw money and that gives rise to interest payments or calculations at regular intervals, and daily change of the applicable rate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCallAccountCallMoney = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallAccountCallMoney";
			definition = "Cash account with a notice period to withdraw money and that gives rise to interest payments or calculations at regular intervals, and daily change of the applicable rate.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "CACM";
		}
	};
	/**
	 * Unsecured interest-bearing deposit that is either redeemable at notice or
	 * has a maturity of no more than one year, that is 397 days after the
	 * settlement date, and which is either taken (borrowing) or placed
	 * (lending) by the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode
	 * FinancialInstrumentProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unsecured interest-bearing deposit that is either redeemable at notice or has a maturity of no more than one year, that is 397 days after the settlement date, and which is either taken (borrowing) or placed (lending) by the agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deposit";
			definition = "Unsecured interest-bearing deposit that is either redeemable at notice or has a maturity of no more than one year, that is 397 days after the settlement date, and which is either taken (borrowing) or placed (lending) by the agent.";
			owner_lazy = () -> FinancialInstrumentProductTypeCode.mmObject();
			codeName = "DPST";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("TERM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentProductTypeCode";
				definition = "Specifies the type of product or financial instrument.";
				code_lazy = () -> Arrays.asList(FinancialInstrumentProductTypeCode.mmTermLoan, FinancialInstrumentProductTypeCode.mmRevolverLoan, FinancialInstrumentProductTypeCode.mmRevolverTermLoan,
						FinancialInstrumentProductTypeCode.mmBridgeLoan, FinancialInstrumentProductTypeCode.mmLetterOfCredit, FinancialInstrumentProductTypeCode.mmSwingLineFacilityLoan,
						FinancialInstrumentProductTypeCode.mmDebtorInPossession, FinancialInstrumentProductTypeCode.mmDefaultedLoan, FinancialInstrumentProductTypeCode.mmWithdrawnLoan, FinancialInstrumentProductTypeCode.mmReplacedLoan,
						FinancialInstrumentProductTypeCode.mmMaturedLoan, FinancialInstrumentProductTypeCode.mmAmendedRestatedLoan, FinancialInstrumentProductTypeCode.mmRetiredLoan, FinancialInstrumentProductTypeCode.mmBradyBond,
						FinancialInstrumentProductTypeCode.mmUSTreasuryBond, FinancialInstrumentProductTypeCode.mmSTRIPS, FinancialInstrumentProductTypeCode.mmTreasuryInflationProtectedSecurity,
						FinancialInstrumentProductTypeCode.mmPrincipalStripCallableBond, FinancialInstrumentProductTypeCode.mmPrincipalStripNonCallableBond, FinancialInstrumentProductTypeCode.mmUSTreasuryNote,
						FinancialInstrumentProductTypeCode.mmUSTreasuryBill, FinancialInstrumentProductTypeCode.mmCommonStock, FinancialInstrumentProductTypeCode.mmPreferredStock, FinancialInstrumentProductTypeCode.mmNoSecurityType,
						FinancialInstrumentProductTypeCode.mmMutualFund, FinancialInstrumentProductTypeCode.mmMultiLeg, FinancialInstrumentProductTypeCode.mmForeignExchangeContract,
						FinancialInstrumentProductTypeCode.mmOtherAnticipationNote, FinancialInstrumentProductTypeCode.mmCertificateOfObligation, FinancialInstrumentProductTypeCode.mmCertificateOfParticipation,
						FinancialInstrumentProductTypeCode.mmGeneralObligationBond, FinancialInstrumentProductTypeCode.mmMandatoryTender, FinancialInstrumentProductTypeCode.mmRevenueAnticipationNote,
						FinancialInstrumentProductTypeCode.mmRevenueBond, FinancialInstrumentProductTypeCode.mmSpecialAssessmentMunicipalBond, FinancialInstrumentProductTypeCode.mmSpecialObligation,
						FinancialInstrumentProductTypeCode.mmSpecialTax, FinancialInstrumentProductTypeCode.mmTaxAnticipationNote, FinancialInstrumentProductTypeCode.mmTaxAllocation,
						FinancialInstrumentProductTypeCode.mmTaxExemptCommercialPaper, FinancialInstrumentProductTypeCode.mmTaxRevenueAnticipationNote, FinancialInstrumentProductTypeCode.mmVariableRateDemandNote,
						FinancialInstrumentProductTypeCode.mmWarrant, FinancialInstrumentProductTypeCode.mmAgencyPool, FinancialInstrumentProductTypeCode.mmAssetBackedBond,
						FinancialInstrumentProductTypeCode.mmCollateralisedMortgageSecurity, FinancialInstrumentProductTypeCode.mmCorporateMortgageBackedSecurity, FinancialInstrumentProductTypeCode.mmIOETTEMortgage,
						FinancialInstrumentProductTypeCode.mmMortgageBackedSecurity, FinancialInstrumentProductTypeCode.mmMortgageInterestOnly, FinancialInstrumentProductTypeCode.mmMortgagePrincipalOnly,
						FinancialInstrumentProductTypeCode.mmMortgagePrivatePlacement, FinancialInstrumentProductTypeCode.mmMiscellaneousPassThrough, FinancialInstrumentProductTypeCode.mmToBeAnnouncedMortgage,
						FinancialInstrumentProductTypeCode.mmFederalAgencyCoupon, FinancialInstrumentProductTypeCode.mmFederalAgencyDiscountNote, FinancialInstrumentProductTypeCode.mmPrivateExportFunding,
						FinancialInstrumentProductTypeCode.mmBankersAcceptance, FinancialInstrumentProductTypeCode.mmBankNote, FinancialInstrumentProductTypeCode.mmBillOfExchange, FinancialInstrumentProductTypeCode.mmCertificateOfDeposit,
						FinancialInstrumentProductTypeCode.mmCallLoan, FinancialInstrumentProductTypeCode.mmCommercialPaper, FinancialInstrumentProductTypeCode.mmDepositNote, FinancialInstrumentProductTypeCode.mmLiquidityNote,
						FinancialInstrumentProductTypeCode.mmMediumTermNote, FinancialInstrumentProductTypeCode.mmOvernightDeposit, FinancialInstrumentProductTypeCode.mmPromissoryNote,
						FinancialInstrumentProductTypeCode.mmRepurchaseAgreement, FinancialInstrumentProductTypeCode.mmReverseRepurchaseAgreement, FinancialInstrumentProductTypeCode.mmShortTermLoanNote,
						FinancialInstrumentProductTypeCode.mmTimeDeposit, FinancialInstrumentProductTypeCode.mmExtendedCommercialNote, FinancialInstrumentProductTypeCode.mmCorporateBond,
						FinancialInstrumentProductTypeCode.mmCorporatePrivatePlacement, FinancialInstrumentProductTypeCode.mmConvertibleBond, FinancialInstrumentProductTypeCode.mmDualCurrencyBond,
						FinancialInstrumentProductTypeCode.mmIndexedLinkedCorporateBond, FinancialInstrumentProductTypeCode.mmStructuredNote, FinancialInstrumentProductTypeCode.mmYankeeCorporateBond,
						FinancialInstrumentProductTypeCode.mmAssetBackedCommercialPaper, FinancialInstrumentProductTypeCode.mmFloatingRateNote, FinancialInstrumentProductTypeCode.mmOtherShortTermDebtSecurities,
						FinancialInstrumentProductTypeCode.mmCallAccountCallMoney, FinancialInstrumentProductTypeCode.mmDeposit);
			}
		});
		return mmObject_lazy.get();
	}
}