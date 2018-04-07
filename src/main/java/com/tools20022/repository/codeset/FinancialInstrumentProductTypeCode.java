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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of product or financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#TermLoan
 * FinancialInstrumentProductTypeCode.TermLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#RevolverLoan
 * FinancialInstrumentProductTypeCode.RevolverLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#RevolverTermLoan
 * FinancialInstrumentProductTypeCode.RevolverTermLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#BridgeLoan
 * FinancialInstrumentProductTypeCode.BridgeLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#LetterOfCredit
 * FinancialInstrumentProductTypeCode.LetterOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#SwingLineFacilityLoan
 * FinancialInstrumentProductTypeCode.SwingLineFacilityLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#DebtorInPossession
 * FinancialInstrumentProductTypeCode.DebtorInPossession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#DefaultedLoan
 * FinancialInstrumentProductTypeCode.DefaultedLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#WithdrawnLoan
 * FinancialInstrumentProductTypeCode.WithdrawnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#ReplacedLoan
 * FinancialInstrumentProductTypeCode.ReplacedLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#MaturedLoan
 * FinancialInstrumentProductTypeCode.MaturedLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#AmendedRestatedLoan
 * FinancialInstrumentProductTypeCode.AmendedRestatedLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#RetiredLoan
 * FinancialInstrumentProductTypeCode.RetiredLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#BradyBond
 * FinancialInstrumentProductTypeCode.BradyBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#USTreasuryBond
 * FinancialInstrumentProductTypeCode.USTreasuryBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#STRIPS
 * FinancialInstrumentProductTypeCode.STRIPS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#TreasuryInflationProtectedSecurity
 * FinancialInstrumentProductTypeCode.TreasuryInflationProtectedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#PrincipalStripCallableBond
 * FinancialInstrumentProductTypeCode.PrincipalStripCallableBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#PrincipalStripNonCallableBond
 * FinancialInstrumentProductTypeCode.PrincipalStripNonCallableBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#USTreasuryNote
 * FinancialInstrumentProductTypeCode.USTreasuryNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#USTreasuryBill
 * FinancialInstrumentProductTypeCode.USTreasuryBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#CommonStock
 * FinancialInstrumentProductTypeCode.CommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#PreferredStock
 * FinancialInstrumentProductTypeCode.PreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#NoSecurityType
 * FinancialInstrumentProductTypeCode.NoSecurityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#MutualFund
 * FinancialInstrumentProductTypeCode.MutualFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#MultiLeg
 * FinancialInstrumentProductTypeCode.MultiLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#ForeignExchangeContract
 * FinancialInstrumentProductTypeCode.ForeignExchangeContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#OtherAnticipationNote
 * FinancialInstrumentProductTypeCode.OtherAnticipationNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#CertificateOfObligation
 * FinancialInstrumentProductTypeCode.CertificateOfObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#CertificateOfParticipation
 * FinancialInstrumentProductTypeCode.CertificateOfParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#GeneralObligationBond
 * FinancialInstrumentProductTypeCode.GeneralObligationBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#MandatoryTender
 * FinancialInstrumentProductTypeCode.MandatoryTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#RevenueAnticipationNote
 * FinancialInstrumentProductTypeCode.RevenueAnticipationNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#RevenueBond
 * FinancialInstrumentProductTypeCode.RevenueBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#SpecialAssessmentMunicipalBond
 * FinancialInstrumentProductTypeCode.SpecialAssessmentMunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#SpecialObligation
 * FinancialInstrumentProductTypeCode.SpecialObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#SpecialTax
 * FinancialInstrumentProductTypeCode.SpecialTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#TaxAnticipationNote
 * FinancialInstrumentProductTypeCode.TaxAnticipationNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#TaxAllocation
 * FinancialInstrumentProductTypeCode.TaxAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#TaxExemptCommercialPaper
 * FinancialInstrumentProductTypeCode.TaxExemptCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#TaxRevenueAnticipationNote
 * FinancialInstrumentProductTypeCode.TaxRevenueAnticipationNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#VariableRateDemandNote
 * FinancialInstrumentProductTypeCode.VariableRateDemandNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#Warrant
 * FinancialInstrumentProductTypeCode.Warrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#AgencyPool
 * FinancialInstrumentProductTypeCode.AgencyPool}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#AssetBackedBond
 * FinancialInstrumentProductTypeCode.AssetBackedBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#CollateralisedMortgageSecurity
 * FinancialInstrumentProductTypeCode.CollateralisedMortgageSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#CorporateMortgageBackedSecurity
 * FinancialInstrumentProductTypeCode.CorporateMortgageBackedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#IOETTEMortgage
 * FinancialInstrumentProductTypeCode.IOETTEMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#MortgageBackedSecurity
 * FinancialInstrumentProductTypeCode.MortgageBackedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#MortgageInterestOnly
 * FinancialInstrumentProductTypeCode.MortgageInterestOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#MortgagePrincipalOnly
 * FinancialInstrumentProductTypeCode.MortgagePrincipalOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#MortgagePrivatePlacement
 * FinancialInstrumentProductTypeCode.MortgagePrivatePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#MiscellaneousPassThrough
 * FinancialInstrumentProductTypeCode.MiscellaneousPassThrough}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#ToBeAnnouncedMortgage
 * FinancialInstrumentProductTypeCode.ToBeAnnouncedMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#FederalAgencyCoupon
 * FinancialInstrumentProductTypeCode.FederalAgencyCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#FederalAgencyDiscountNote
 * FinancialInstrumentProductTypeCode.FederalAgencyDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#PrivateExportFunding
 * FinancialInstrumentProductTypeCode.PrivateExportFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#BankersAcceptance
 * FinancialInstrumentProductTypeCode.BankersAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#BankNote
 * FinancialInstrumentProductTypeCode.BankNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#BillOfExchange
 * FinancialInstrumentProductTypeCode.BillOfExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#CertificateOfDeposit
 * FinancialInstrumentProductTypeCode.CertificateOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#CallLoan
 * FinancialInstrumentProductTypeCode.CallLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#CommercialPaper
 * FinancialInstrumentProductTypeCode.CommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#DepositNote
 * FinancialInstrumentProductTypeCode.DepositNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#LiquidityNote
 * FinancialInstrumentProductTypeCode.LiquidityNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#MediumTermNote
 * FinancialInstrumentProductTypeCode.MediumTermNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#OvernightDeposit
 * FinancialInstrumentProductTypeCode.OvernightDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#PromissoryNote
 * FinancialInstrumentProductTypeCode.PromissoryNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#RepurchaseAgreement
 * FinancialInstrumentProductTypeCode.RepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#ReverseRepurchaseAgreement
 * FinancialInstrumentProductTypeCode.ReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#ShortTermLoanNote
 * FinancialInstrumentProductTypeCode.ShortTermLoanNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#TimeDeposit
 * FinancialInstrumentProductTypeCode.TimeDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#ExtendedCommercialNote
 * FinancialInstrumentProductTypeCode.ExtendedCommercialNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#CorporateBond
 * FinancialInstrumentProductTypeCode.CorporateBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#CorporatePrivatePlacement
 * FinancialInstrumentProductTypeCode.CorporatePrivatePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#ConvertibleBond
 * FinancialInstrumentProductTypeCode.ConvertibleBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#DualCurrencyBond
 * FinancialInstrumentProductTypeCode.DualCurrencyBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#IndexedLinkedCorporateBond
 * FinancialInstrumentProductTypeCode.IndexedLinkedCorporateBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#StructuredNote
 * FinancialInstrumentProductTypeCode.StructuredNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#YankeeCorporateBond
 * FinancialInstrumentProductTypeCode.YankeeCorporateBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#AssetBackedCommercialPaper
 * FinancialInstrumentProductTypeCode.AssetBackedCommercialPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#FloatingRateNote
 * FinancialInstrumentProductTypeCode.FloatingRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#OtherShortTermDebtSecurities
 * FinancialInstrumentProductTypeCode.OtherShortTermDebtSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#CallAccountCallMoney
 * FinancialInstrumentProductTypeCode.CallAccountCallMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode#Deposit
 * FinancialInstrumentProductTypeCode.Deposit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialInstrumentProductTypeCode extends MMCode {

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
	public static final FinancialInstrumentProductTypeCode TermLoan = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TermLoan";
			definition = "Business loan, usually fixed or variable, for an extended term of up to 10 years. A term loan generally provides an agreed upon payment schedule with the amounts paid not able to be re-borrowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode RevolverLoan = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RevolverLoan";
			definition = "Loan that allows the borrower to borrow, repay and re-borrow, as needed over the life of the loan facility.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode RevolverTermLoan = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RevolverTermLoan";
			definition = "Outstanding loan amount in a revolving loan facility that may fluctuate on a daily basis. A revolver allows the borrower to borrow, repay, and re-borrow as needed over the life of the loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode BridgeLoan = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BridgeLoan";
			definition = "Interim financing used to solidify a position until permanent financing is secured. It is also called a swing loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode LetterOfCredit = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfCredit";
			definition = "Instrument issued by a bank substituting its name and credit standing for that of its customer. A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode SwingLineFacilityLoan = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwingLineFacilityLoan";
			definition = "Credit facility allowing a borrower to bridge time gaps that might occur due to switching the loan from domestic borrowing to international borrowing (or vice versa), or switching the type of loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode DebtorInPossession = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebtorInPossession";
			definition = "Firm that continues to operate under the Chapter 11 bankruptcy policy.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode DefaultedLoan = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefaultedLoan";
			definition = "Failure to make timely payments of interest or principal on a debt security.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode WithdrawnLoan = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithdrawnLoan";
			definition = "Loan that is disbursed against a security.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode ReplacedLoan = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReplacedLoan";
			definition = "Loan that has been paid or replaced by a new loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode MaturedLoan = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaturedLoan";
			definition = "Outstanding debt instrument that has reached final maturity and can no longer earn interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode AmendedRestatedLoan = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmendedRestatedLoan";
			definition = "Loan agreement that results in a new loan after the restructuring of an existing loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode RetiredLoan = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RetiredLoan";
			definition = "Loan that is no longer performing.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode BradyBond = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BradyBond";
			definition = "Series of sovereign bonds issued by several developing countries in exchange for their rescheduled bank loans. A brady bond is defaulted emerging market debt that is traded at a discount.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode USTreasuryBond = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USTreasuryBond";
			definition = "Security that pays a fixed rate of interest every six months until maturity, when the investor receives payment for the par value of the security. Treasury notes mature in more than a year, but no more than 10 years from the issue date.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	 * "Separate Trading of Registered Interest and Principal of Securities. STRIPS are also called zero-coupon securities, because the only time an investor receives a payment during the life of a STRIP is when it matures. The STRIPS program lets investors hold and trade the individual interest."
	 * </li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductTypeCode STRIPS = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "STRIPS";
			definition = "Separate Trading of Registered Interest and Principal of Securities. STRIPS are also called zero-coupon securities, because the only time an investor receives a payment during the life of a STRIP is when it matures. The STRIPS program lets investors hold and trade the individual interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode TreasuryInflationProtectedSecurity = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasuryInflationProtectedSecurity";
			definition = "5, 10, or 30 year US Treasuries for which the interest rate, set at auction, remains fixed throughout the term of the security. The principal amount of the security is adjusted for inflation, though the inflation adjusted principal will not be paid until maturity.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode PrincipalStripCallableBond = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrincipalStripCallableBond";
			definition = "Principal strip portion of a bond with a call provision.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode PrincipalStripNonCallableBond = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrincipalStripNonCallableBond";
			definition = "Principal strip of a bullet bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode USTreasuryNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USTreasuryNote";
			definition = "Bonds that mature more than 10 years from their issue date.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	 * "Short-term securities that mature in one year or less from their issue date, and are sold at a price less than their par (face) value. A US Treasury Bill is also called a T-Bill."
	 * </li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductTypeCode USTreasuryBill = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USTreasuryBill";
			definition = "Short-term securities that mature in one year or less from their issue date, and are sold at a price less than their par (face) value. A US Treasury Bill is also called a T-Bill.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode CommonStock = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommonStock";
			definition = "Units representing equity ownership in a public company. Common stock also gives the holder voting rights, profits via dividends or capital appreciation.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode PreferredStock = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreferredStock";
			definition = "Class of capital stock that pays dividends at a specific rate and has preference over common stock in divident payments and asset liquidation. Preferred stock does not usually carry voting rights. It has the characteristics of both common stock and debt.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode NoSecurityType = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoSecurityType";
			definition = "No security type specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode MutualFund = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MutualFund";
			definition = "Investment fund operated by an investment company. Mutual funds are pools of money that are managed by an investment company.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode MultiLeg = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultiLeg";
			definition = "Derivative security or strategy where the \"deal\" is composed of constituent securities, yet are to be thought of as one deal or transaction, eg, bond swap, straddle or strangle. A more common asset, which is multileg by definition, is a currency or an interest rate swap. Some deals can have more than one leg, eg, a butterfly spread.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode ForeignExchangeContract = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeContract";
			definition = "Legally binding agreement to buy or sell a commodity, eg, foreign currency, or financial instrument in a designated future month at a price agreed upon today by the buyer and seller.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode OtherAnticipationNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherAnticipationNote";
			definition = "Anticipation note other than Tax Anticipation Notes or Revenue Anticipation Notes, eg, grants and education notes.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode CertificateOfObligation = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateOfObligation";
			definition = "Long-term debt issued by a city.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode CertificateOfParticipation = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateOfParticipation";
			definition = "Structure where investors buy certificates that entitle them to receive a participation or share in the lease payments from a particular project. The lease payments are passed through the lessor to the certificate holders with the tax advantages intact. The lessor typically assigns the lease and lease payments to a trustee, then distributes the lease payments to the certificate holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode GeneralObligationBond = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GeneralObligationBond";
			definition = "Municipal securities secured by the issuer's pledge of its full faith, credit, and taxing power.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode MandatoryTender = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandatoryTender";
			definition = "Sinking fund feature.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode RevenueAnticipationNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RevenueAnticipationNote";
			definition = "Financial instruments issued in anticipation of other sources of future revenue, other than taxes. This may include intergovernmental aid. The interest is usually tax-free to the security holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	 * "Bond issued by a municipality to finance either a project or an enterprise. The issuer pledges to the bondholders that the debt service is payable solely by the revenues generated by the operation of the projects financed, a category of facilities, or from another non-tax source."
	 * </li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductTypeCode RevenueBond = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RevenueBond";
			definition = "Bond issued by a municipality to finance either a project or an enterprise. The issuer pledges to the bondholders that the debt service is payable solely by the revenues generated by the operation of the projects financed, a category of facilities, or from another non-tax source.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode SpecialAssessmentMunicipalBond = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialAssessmentMunicipalBond";
			definition = "Municipal bond with interest paid by the taxes of the community benefiting from the bond funded project.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode SpecialObligation = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialObligation";
			definition = "Municipal bond with interest paid by the taxes of the community benefiting from the bond funded project.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode SpecialTax = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialTax";
			definition = "Bond secured by a special tax, eg, gasoline tax or other excise tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode TaxAnticipationNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxAnticipationNote";
			definition = "Notes issued by states or municipalities to finance current operations in anticipation of future tax receipts.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode TaxAllocation = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxAllocation";
			definition = "Notes payable with a collection of taxes earmarked for repayment of the notes.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode TaxExemptCommercialPaper = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxExemptCommercialPaper";
			definition = "Short-term promissory note issued for periods of up to 270 days, often used in lieu of Tax Anticipation Notes and Revenue Anticipation Notes because of the greater flexibility offered in setting both maturities and determining rates. A bond usually issued by municipal, county or state governments whose interest payments are not subject to federal and, in some cases, state and local income tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode TaxRevenueAnticipationNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRevenueAnticipationNote";
			definition = "Notes that are issued by states or municipalities to finance current operations in anticipation of future tax receipts or other expected revenues.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode VariableRateDemandNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableRateDemandNote";
			definition = "Bond that bears interest at a variable or floating rate established at specified intervals, eg, flexible or monthly. A variable rate demand note contains a put option permitting the bondholder to tender the bond for purchase when a new interest rate is established.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode Warrant = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Warrant";
			definition = "The right to buy a specified amount of shares at a pre-determined price and time. A warrant is similar to call options, but much longer time spans can extend to warrants that are offered by corporations, while exchange-traded call options are not.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode AgencyPool = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgencyPool";
			definition = "Collection of mortgages that have been securitised. The shares or participation certificates in the pool are sold to investors called mortgage pass-throughs. In order to securitise loans and attenuate risk in the mortgage market, a security is created when one or more mortgage holders form a collection pool of mortgages and sells shares or participation certificates in the pool. The cash flow from the collateral pool is \"passed through\" to the security holder as monthly payments of principal, interest and pre-payments.\n\n.\n\n.\n\n.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode AssetBackedBond = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetBackedBond";
			definition = "Bond that is collateralised by loans, leases or installment contracts on personal property, but not real estate. Asset backed bonds are usually receivables such as credit card receivables, home-equity loans, manufactured homes loans and automobile loans.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode CollateralisedMortgageSecurity = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralisedMortgageSecurity";
			definition = "Security backed by a pool of pass-throughs or a pool of mortgage loans.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode CorporateMortgageBackedSecurity = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateMortgageBackedSecurity";
			definition = "Mortgage backed security whose cash flows are backed by major property mortgages, eg, office space, retail property or hotels. Corporate mortgage backed securities are also called commercial mortgage-backed securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode IOETTEMortgage = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IOETTEMortgage";
			definition = "Interest only (IO) tranche in a collateralized mortgage obligation (CMO).";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode MortgageBackedSecurity = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MortgageBackedSecurity";
			definition = "Instrument whose cash flow depends on the cash flows of an underlying pool of mortgages. Mortgage backed securities are usually residential mortgages.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode MortgageInterestOnly = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MortgageInterestOnly";
			definition = "Security whose cash flow is from the interest payments of the underlying collateral, and is based solely on the interest component from a pool of mortgages or other bonds. When the principal on the mortgages or bonds has been repaid, interest payments stop and the value of the interest only (IO) falls to zero.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode MortgagePrincipalOnly = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MortgagePrincipalOnly";
			definition = "Security whose cash flow is from the principal payments of the underlying collateral. Mortgage principal only is a mortgage backed security (MBS) where the holder receives only principal cash flows on the underlying mortgage pool. All the principal distribution due from the underlying collateral pool is paid to the registered holder of the stripped MBS on the basis of the current face value of the underlying collateral pool.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode MortgagePrivatePlacement = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MortgagePrivatePlacement";
			definition = "Contract between a lender and a property owner that provides a loan defining the property as collateral. A mortgage private placement involves the issuance of a security to a group of no more than 35 investors.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	 * "Security created when one or more mortgage holders form a collection (pool) of mortgages and sell shares or participation certificates in the pool. The cash flow from the collateral pool is \"passed through\" to the security holder as monthly payments of principal, interest, and prepayments. A miscellaneous pass through is also called a passthrough."
	 * </li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductTypeCode MiscellaneousPassThrough = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MiscellaneousPassThrough";
			definition = "Security created when one or more mortgage holders form a collection (pool) of mortgages and sell shares or participation certificates in the pool. The cash flow from the collateral pool is \"passed through\" to the security holder as monthly payments of principal, interest, and prepayments. A miscellaneous pass through is also called a passthrough.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	 * "Contract for the purchase or sale of a mortgage backed security to be delivered at an agreed-upon future date. A To Be Announced (TBA) Mortgage does not include a specified pool number, number of pools or the precise amount to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductTypeCode ToBeAnnouncedMortgage = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ToBeAnnouncedMortgage";
			definition = "Contract for the purchase or sale of a mortgage backed security to be delivered at an agreed-upon future date. A To Be Announced (TBA) Mortgage does not include a specified pool number, number of pools or the precise amount to be delivered.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode FederalAgencyCoupon = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FederalAgencyCoupon";
			definition = "Fixed income coupon security issued by a federal agency, eg, the Tennessee Valley Authority, or a government sponsored enterprise, eg, FreddieMac.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode FederalAgencyDiscountNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FederalAgencyDiscountNote";
			definition = "Fixed income discounted notes issued by a federal agency, eg, the Tennessee Valley Authority, or a government-sponsored enterprise, eg, FreddieMac. Discount notes are unsecured general corporate obligations that are issued at a discount and mature at par. Agency discount notes give institutional and retail investors convenient choices with regard to the investment date, maturity date and size of their short-term investments. Maturities of discount notes can range from overnight through one year.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode PrivateExportFunding = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrivateExportFunding";
			definition = "Private capital for financing the export of big ticket items by U.S. firms. Private export funding is done by purchasing the medium to long-term debt of importers of U.S. products at fixed interest rates.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode BankersAcceptance = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankersAcceptance";
			definition = "Time draft drawn upon and accepted by a bank, as well as the customary means of effecting payment for merchandise sold in import-export transactions. A Bankers Acceptance is a source of financing used extensively in international trade. With the credit strength of a bank behind it, the banker's acceptance usually qualifies as a money market instrument. The liability assumed by the bank is called its acceptance liability.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode BankNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankNote";
			definition = "Securities that are exempt from registration under section 3(a)2 of the Securities Act 1933, and that have characteristics in common with certificates of deposit (CDs), medium term notes (MTNs) and short-term bonds.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode BillOfExchange = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillOfExchange";
			definition = "Written order from one party (the drawer) to another (the drawee) to pay a specified sum upon demand, or on a specified date, to the drawer or to a third party specified by the drawer. A bill of exchange is also called a draft.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode CertificateOfDeposit = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateOfDeposit";
			definition = "Certificate issued by a bank or thrift that indicates a specified sum of money deposited. The certificate has a maturity date and a specified interest rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode CallLoan = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CallLoan";
			definition = "Loan repayable on demand. A call loan is also known as a broker loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode CommercialPaper = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialPaper";
			definition = "Short-term, unsecured promissory note issued by a corporation. The maturity is typically less than 270 days, with a most common maturity range of 30 to 50 days or less. Commercial paper is usually issued at a discount, though some are interest-bearing.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode DepositNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositNote";
			definition = "Savings instrument issued by banks with a fixed interest rate, usually paid on a monthly basis, and a fixed maturity date. A deposit note has an optional call provision and is insured by the Federal Deposit Insurance Corporation (for U.S). It is sometimes called a Certificate of Deposit (CD).";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode LiquidityNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiquidityNote";
			definition = "Note that is easily and cheaply converted to cash, ie, cash itself and short-term products.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	 * "Highly flexible debt instruments that can be easily structured in response to changing market conditions and investor tastes. The maturity ranges from 9 months to 30 years or more. Medium term notes are typically non-callable, unsecured senior debt with fixed-coupon rates that carry an investment grade credit rating. It is also a corporate debt instrument that is continuously offered to investors over a period of time by an agent of the issuer."
	 * </li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductTypeCode MediumTermNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MediumTermNote";
			definition = "Highly flexible debt instruments that can be easily structured in response to changing market conditions and investor tastes. The maturity ranges from 9 months to 30 years or more. Medium term notes are typically non-callable, unsecured senior debt with fixed-coupon rates that carry an investment grade credit rating. It is also a corporate debt instrument that is continuously offered to investors over a period of time by an agent of the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode OvernightDeposit = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OvernightDeposit";
			definition = "Unsecured, offshore Eurodollar used by corporations for depositing cash flows overnight, usually deposited to a branch of a domestic bank. An overnight deposit is a facility to place short-term surplus funds with a bank, (generally central banks), at the end of the day while earning interest. The rate provides the floor for short-term money market rates. Due to a large minimum, banks offer overnight deposits primarily to large clients.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode PromissoryNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PromissoryNote";
			definition = "Written promise committing the maker to pay the payee a specified sum of money either on demand, or at a fixed determinable future date, with or without interest. The instruments meeting this criteria are negotiable.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode RepurchaseAgreement = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Agreement with a commitment by the seller (dealer) to buy a security back from the purchaser (customer) at a specified price and a designated future date. A repurchase agreement, or repo, represents a collateralised short-term loan where the collateral may be a treasury security, money market instrument, federal agency security or a mortgage-backed security.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	 * "Similar to a repurchase agreement, with the exception that it is from the purchaser's (customer's) perspective. Reverse repos offer the holders of fixed income securities a means of temporarily absorbing reserves by selling securities under an agreement to subsequently repurchase them. It offers the customer of the transaction the security as collateral to the loan."
	 * </li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductTypeCode ReverseRepurchaseAgreement = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReverseRepurchaseAgreement";
			definition = "Similar to a repurchase agreement, with the exception that it is from the purchaser's (customer's) perspective. Reverse repos offer the holders of fixed income securities a means of temporarily absorbing reserves by selling securities under an agreement to subsequently repurchase them. It offers the customer of the transaction the security as collateral to the loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	 * "Note with a term that is usually less than a year, but can be as long as two years."
	 * </li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductTypeCode ShortTermLoanNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShortTermLoanNote";
			definition = "Note with a term that is usually less than a year, but can be as long as two years.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	 * "Loan that accrues interest for a pre-set time, eg, a bank savings account or Certificate of Deposit (CD). Money is invested for a fixed period and earns an attractive return. A time deposit is usually offered with a range of investment amounts, maturities, and interest payment dates."
	 * </li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductTypeCode TimeDeposit = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeDeposit";
			definition = "Loan that accrues interest for a pre-set time, eg, a bank savings account or Certificate of Deposit (CD). Money is invested for a fixed period and earns an attractive return. A time deposit is usually offered with a range of investment amounts, maturities, and interest payment dates.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode ExtendedCommercialNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExtendedCommercialNote";
			definition = "Unsecured commitment issued by a corporation to finance its short-term credit needs, with maturity dates being as short as two days and extending to a year. Extended commercial notes (CNs) are those with maturity dates extending beyond the committed dates.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode CorporateBond = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateBond";
			definition = "Debt obligations issued by private corporations.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	 * "Sale of bonds directly to an institutional investor, eg, an insurance company. Securities are purchased for investment, and are not to be resold to the public."
	 * </li>
	 * </ul>
	 */
	public static final FinancialInstrumentProductTypeCode CorporatePrivatePlacement = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporatePrivatePlacement";
			definition = "Sale of bonds directly to an institutional investor, eg, an insurance company. Securities are purchased for investment, and are not to be resold to the public.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 167</li>
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
	public static final FinancialInstrumentProductTypeCode ConvertibleBond = new FinancialInstrumentProductTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "167"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConvertibleBond";
			definition = "Bond that can be exchanged for specified amounts of common stock in the issuing firm. The conversion process cannot be reversed, and the conversion details are described in the bond's indenture.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode DualCurrencyBond = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DualCurrencyBond";
			definition = "Eurobonds that pay coupon interest in one currency and principal in a different currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode IndexedLinkedCorporateBond = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IndexedLinkedCorporateBond";
			definition = "Bond issue that is inflation-indexed, whereas coupon payments are timed to an inflation index. Indexed linked corporate bond is a product whose valuation or cash flows is a function of an index, eg, sovereign bonds such as U.S. Treasuries or U.K. Gilts, whose coupon rate is adjusted periodically as a function of an inflation index.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode StructuredNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StructuredNote";
			definition = "Note with an embedded derivative, eg, a synthetic-fixed rate note created by issuing a floating rate note while entering into a \"plain vanilla\" interest rate swap to offset the floating rate payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode YankeeCorporateBond = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YankeeCorporateBond";
			definition = "Dollar denominated bonds issued in the U.S. by foreign corporations, banks, and sovereigns that are sold in the U.S. market, eg, bonds issued by originators with roots in Japan are called Samurai bonds.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode AssetBackedCommercialPaper = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetBackedCommercialPaper";
			definition = "Debt instrument issued by a financial institution which has a maturity of no more than one year, is either interest-bearing or discounted and is backed by some form of collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode FloatingRateNote = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateNote";
			definition = "Debt instrument in which the periodic interest payments are calculated on the basis of the value (fixing of an underlying reference rate such as the Euribor) on predefined dates (fixing dates) and which has a maturity of no more tha one year.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode OtherShortTermDebtSecurities = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherShortTermDebtSecurities";
			definition = "Other short term debt securities issued.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode CallAccountCallMoney = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallAccountCallMoney";
			definition = "Cash account with a notice period to withdraw money and that gives rise to interest payments or calculations at regular intervals, and daily change of the applicable rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
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
	public static final FinancialInstrumentProductTypeCode Deposit = new FinancialInstrumentProductTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deposit";
			definition = "Unsecured interest-bearing deposit that is either redeemable at notice or has a maturity of no more than one year, that is 397 days after the settlement date, and which is either taken (borrowing) or placed (lending) by the agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.mmObject();
			codeName = "DPST";
		}
	};
	final static private LinkedHashMap<String, FinancialInstrumentProductTypeCode> codesByName = new LinkedHashMap<>();

	protected FinancialInstrumentProductTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TERM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentProductTypeCode";
				definition = "Specifies the type of product or financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TermLoan, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.RevolverLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.RevolverTermLoan, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.BridgeLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.LetterOfCredit, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.SwingLineFacilityLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.DebtorInPossession, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.DefaultedLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.WithdrawnLoan, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ReplacedLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MaturedLoan, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.AmendedRestatedLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.RetiredLoan, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.BradyBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.USTreasuryBond, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.STRIPS,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TreasuryInflationProtectedSecurity, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.PrincipalStripCallableBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.PrincipalStripNonCallableBond, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.USTreasuryNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.USTreasuryBill, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CommonStock,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.PreferredStock, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.NoSecurityType,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MutualFund, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MultiLeg,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ForeignExchangeContract, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.OtherAnticipationNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CertificateOfObligation, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CertificateOfParticipation,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.GeneralObligationBond, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MandatoryTender,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.RevenueAnticipationNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.RevenueBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.SpecialAssessmentMunicipalBond, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.SpecialObligation,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.SpecialTax, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TaxAnticipationNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TaxAllocation, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TaxExemptCommercialPaper,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TaxRevenueAnticipationNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.VariableRateDemandNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.Warrant, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.AgencyPool,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.AssetBackedBond, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CollateralisedMortgageSecurity,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CorporateMortgageBackedSecurity, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.IOETTEMortgage,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MortgageBackedSecurity, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MortgageInterestOnly,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MortgagePrincipalOnly, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MortgagePrivatePlacement,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MiscellaneousPassThrough, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ToBeAnnouncedMortgage,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.FederalAgencyCoupon, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.FederalAgencyDiscountNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.PrivateExportFunding, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.BankersAcceptance,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.BankNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.BillOfExchange,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CertificateOfDeposit, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CallLoan,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CommercialPaper, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.DepositNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.LiquidityNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.MediumTermNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.OvernightDeposit, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.PromissoryNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.RepurchaseAgreement, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ReverseRepurchaseAgreement,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ShortTermLoanNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.TimeDeposit,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ExtendedCommercialNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CorporateBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CorporatePrivatePlacement, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.ConvertibleBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.DualCurrencyBond, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.IndexedLinkedCorporateBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.StructuredNote, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.YankeeCorporateBond,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.AssetBackedCommercialPaper, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.FloatingRateNote,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.OtherShortTermDebtSecurities, com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.CallAccountCallMoney,
						com.tools20022.repository.codeset.FinancialInstrumentProductTypeCode.Deposit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TermLoan.getCodeName().get(), TermLoan);
		codesByName.put(RevolverLoan.getCodeName().get(), RevolverLoan);
		codesByName.put(RevolverTermLoan.getCodeName().get(), RevolverTermLoan);
		codesByName.put(BridgeLoan.getCodeName().get(), BridgeLoan);
		codesByName.put(LetterOfCredit.getCodeName().get(), LetterOfCredit);
		codesByName.put(SwingLineFacilityLoan.getCodeName().get(), SwingLineFacilityLoan);
		codesByName.put(DebtorInPossession.getCodeName().get(), DebtorInPossession);
		codesByName.put(DefaultedLoan.getCodeName().get(), DefaultedLoan);
		codesByName.put(WithdrawnLoan.getCodeName().get(), WithdrawnLoan);
		codesByName.put(ReplacedLoan.getCodeName().get(), ReplacedLoan);
		codesByName.put(MaturedLoan.getCodeName().get(), MaturedLoan);
		codesByName.put(AmendedRestatedLoan.getCodeName().get(), AmendedRestatedLoan);
		codesByName.put(RetiredLoan.getCodeName().get(), RetiredLoan);
		codesByName.put(BradyBond.getCodeName().get(), BradyBond);
		codesByName.put(USTreasuryBond.getCodeName().get(), USTreasuryBond);
		codesByName.put(STRIPS.getCodeName().get(), STRIPS);
		codesByName.put(TreasuryInflationProtectedSecurity.getCodeName().get(), TreasuryInflationProtectedSecurity);
		codesByName.put(PrincipalStripCallableBond.getCodeName().get(), PrincipalStripCallableBond);
		codesByName.put(PrincipalStripNonCallableBond.getCodeName().get(), PrincipalStripNonCallableBond);
		codesByName.put(USTreasuryNote.getCodeName().get(), USTreasuryNote);
		codesByName.put(USTreasuryBill.getCodeName().get(), USTreasuryBill);
		codesByName.put(CommonStock.getCodeName().get(), CommonStock);
		codesByName.put(PreferredStock.getCodeName().get(), PreferredStock);
		codesByName.put(NoSecurityType.getCodeName().get(), NoSecurityType);
		codesByName.put(MutualFund.getCodeName().get(), MutualFund);
		codesByName.put(MultiLeg.getCodeName().get(), MultiLeg);
		codesByName.put(ForeignExchangeContract.getCodeName().get(), ForeignExchangeContract);
		codesByName.put(OtherAnticipationNote.getCodeName().get(), OtherAnticipationNote);
		codesByName.put(CertificateOfObligation.getCodeName().get(), CertificateOfObligation);
		codesByName.put(CertificateOfParticipation.getCodeName().get(), CertificateOfParticipation);
		codesByName.put(GeneralObligationBond.getCodeName().get(), GeneralObligationBond);
		codesByName.put(MandatoryTender.getCodeName().get(), MandatoryTender);
		codesByName.put(RevenueAnticipationNote.getCodeName().get(), RevenueAnticipationNote);
		codesByName.put(RevenueBond.getCodeName().get(), RevenueBond);
		codesByName.put(SpecialAssessmentMunicipalBond.getCodeName().get(), SpecialAssessmentMunicipalBond);
		codesByName.put(SpecialObligation.getCodeName().get(), SpecialObligation);
		codesByName.put(SpecialTax.getCodeName().get(), SpecialTax);
		codesByName.put(TaxAnticipationNote.getCodeName().get(), TaxAnticipationNote);
		codesByName.put(TaxAllocation.getCodeName().get(), TaxAllocation);
		codesByName.put(TaxExemptCommercialPaper.getCodeName().get(), TaxExemptCommercialPaper);
		codesByName.put(TaxRevenueAnticipationNote.getCodeName().get(), TaxRevenueAnticipationNote);
		codesByName.put(VariableRateDemandNote.getCodeName().get(), VariableRateDemandNote);
		codesByName.put(Warrant.getCodeName().get(), Warrant);
		codesByName.put(AgencyPool.getCodeName().get(), AgencyPool);
		codesByName.put(AssetBackedBond.getCodeName().get(), AssetBackedBond);
		codesByName.put(CollateralisedMortgageSecurity.getCodeName().get(), CollateralisedMortgageSecurity);
		codesByName.put(CorporateMortgageBackedSecurity.getCodeName().get(), CorporateMortgageBackedSecurity);
		codesByName.put(IOETTEMortgage.getCodeName().get(), IOETTEMortgage);
		codesByName.put(MortgageBackedSecurity.getCodeName().get(), MortgageBackedSecurity);
		codesByName.put(MortgageInterestOnly.getCodeName().get(), MortgageInterestOnly);
		codesByName.put(MortgagePrincipalOnly.getCodeName().get(), MortgagePrincipalOnly);
		codesByName.put(MortgagePrivatePlacement.getCodeName().get(), MortgagePrivatePlacement);
		codesByName.put(MiscellaneousPassThrough.getCodeName().get(), MiscellaneousPassThrough);
		codesByName.put(ToBeAnnouncedMortgage.getCodeName().get(), ToBeAnnouncedMortgage);
		codesByName.put(FederalAgencyCoupon.getCodeName().get(), FederalAgencyCoupon);
		codesByName.put(FederalAgencyDiscountNote.getCodeName().get(), FederalAgencyDiscountNote);
		codesByName.put(PrivateExportFunding.getCodeName().get(), PrivateExportFunding);
		codesByName.put(BankersAcceptance.getCodeName().get(), BankersAcceptance);
		codesByName.put(BankNote.getCodeName().get(), BankNote);
		codesByName.put(BillOfExchange.getCodeName().get(), BillOfExchange);
		codesByName.put(CertificateOfDeposit.getCodeName().get(), CertificateOfDeposit);
		codesByName.put(CallLoan.getCodeName().get(), CallLoan);
		codesByName.put(CommercialPaper.getCodeName().get(), CommercialPaper);
		codesByName.put(DepositNote.getCodeName().get(), DepositNote);
		codesByName.put(LiquidityNote.getCodeName().get(), LiquidityNote);
		codesByName.put(MediumTermNote.getCodeName().get(), MediumTermNote);
		codesByName.put(OvernightDeposit.getCodeName().get(), OvernightDeposit);
		codesByName.put(PromissoryNote.getCodeName().get(), PromissoryNote);
		codesByName.put(RepurchaseAgreement.getCodeName().get(), RepurchaseAgreement);
		codesByName.put(ReverseRepurchaseAgreement.getCodeName().get(), ReverseRepurchaseAgreement);
		codesByName.put(ShortTermLoanNote.getCodeName().get(), ShortTermLoanNote);
		codesByName.put(TimeDeposit.getCodeName().get(), TimeDeposit);
		codesByName.put(ExtendedCommercialNote.getCodeName().get(), ExtendedCommercialNote);
		codesByName.put(CorporateBond.getCodeName().get(), CorporateBond);
		codesByName.put(CorporatePrivatePlacement.getCodeName().get(), CorporatePrivatePlacement);
		codesByName.put(ConvertibleBond.getCodeName().get(), ConvertibleBond);
		codesByName.put(DualCurrencyBond.getCodeName().get(), DualCurrencyBond);
		codesByName.put(IndexedLinkedCorporateBond.getCodeName().get(), IndexedLinkedCorporateBond);
		codesByName.put(StructuredNote.getCodeName().get(), StructuredNote);
		codesByName.put(YankeeCorporateBond.getCodeName().get(), YankeeCorporateBond);
		codesByName.put(AssetBackedCommercialPaper.getCodeName().get(), AssetBackedCommercialPaper);
		codesByName.put(FloatingRateNote.getCodeName().get(), FloatingRateNote);
		codesByName.put(OtherShortTermDebtSecurities.getCodeName().get(), OtherShortTermDebtSecurities);
		codesByName.put(CallAccountCallMoney.getCodeName().get(), CallAccountCallMoney);
		codesByName.put(Deposit.getCodeName().get(), Deposit);
	}

	public static FinancialInstrumentProductTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialInstrumentProductTypeCode[] values() {
		FinancialInstrumentProductTypeCode[] values = new FinancialInstrumentProductTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialInstrumentProductTypeCode> {
		@Override
		public FinancialInstrumentProductTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialInstrumentProductTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}