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
 * Specifies balances of assets and other balances.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmOtherFinancialInstruments
 * FinancialAssetBalanceTypeCode.mmOtherFinancialInstruments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmSettledCash
 * FinancialAssetBalanceTypeCode.mmSettledCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmAccruedIncome
 * FinancialAssetBalanceTypeCode.mmAccruedIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmFXTransaction
 * FinancialAssetBalanceTypeCode.mmFXTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmCash
 * FinancialAssetBalanceTypeCode.mmCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmTreasuryInflatedProtectedSecurity
 * FinancialAssetBalanceTypeCode.mmTreasuryInflatedProtectedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmEquity
 * FinancialAssetBalanceTypeCode.mmEquity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmCommonStock
 * FinancialAssetBalanceTypeCode.mmCommonStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmPreferredStock
 * FinancialAssetBalanceTypeCode.mmPreferredStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmMutualFund
 * FinancialAssetBalanceTypeCode.mmMutualFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmExchangeTradedFund
 * FinancialAssetBalanceTypeCode.mmExchangeTradedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmRights
 * FinancialAssetBalanceTypeCode.mmRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmWarrant
 * FinancialAssetBalanceTypeCode.mmWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmBond
 * FinancialAssetBalanceTypeCode.mmBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmConvertibleBond
 * FinancialAssetBalanceTypeCode.mmConvertibleBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmCorporateBond
 * FinancialAssetBalanceTypeCode.mmCorporateBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmGovernmentBond
 * FinancialAssetBalanceTypeCode.mmGovernmentBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmFuture
 * FinancialAssetBalanceTypeCode.mmFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmOption
 * FinancialAssetBalanceTypeCode.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmSwap
 * FinancialAssetBalanceTypeCode.mmSwap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmCurrencyExchange
 * FinancialAssetBalanceTypeCode.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmForeignInvestment
 * FinancialAssetBalanceTypeCode.mmForeignInvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmGold
 * FinancialAssetBalanceTypeCode.mmGold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmProperty
 * FinancialAssetBalanceTypeCode.mmProperty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmBankersAcceptance
 * FinancialAssetBalanceTypeCode.mmBankersAcceptance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmSyndicatedBankLoan
 * FinancialAssetBalanceTypeCode.mmSyndicatedBankLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmCollateralisedBondObligation
 * FinancialAssetBalanceTypeCode.mmCollateralisedBondObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmCertificateOfDeposit
 * FinancialAssetBalanceTypeCode.mmCertificateOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmCollateralisedDebtObligation
 * FinancialAssetBalanceTypeCode.mmCollateralisedDebtObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmCollateralisedLoanObligation
 * FinancialAssetBalanceTypeCode.mmCollateralisedLoanObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmCollateralisedMortgageObligation
 * FinancialAssetBalanceTypeCode.mmCollateralisedMortgageObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmCommericalPaper
 * FinancialAssetBalanceTypeCode.mmCommericalPaper}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmCorporatePrivatePlacement
 * FinancialAssetBalanceTypeCode.mmCorporatePrivatePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmDiscountNote
 * FinancialAssetBalanceTypeCode.mmDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmFederalAgencyDiscountNote
 * FinancialAssetBalanceTypeCode.mmFederalAgencyDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmFederalHousingAuthority
 * FinancialAssetBalanceTypeCode.mmFederalHousingAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmFederalHomeLoan
 * FinancialAssetBalanceTypeCode.mmFederalHomeLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmFederalNationalMortgageAssociation
 * FinancialAssetBalanceTypeCode.mmFederalNationalMortgageAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmFloatingRateNote
 * FinancialAssetBalanceTypeCode.mmFloatingRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmGovernmentNationalMortgageAssociation
 * FinancialAssetBalanceTypeCode.mmGovernmentNationalMortgageAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmTreasuriesAndAgenciesDebentures
 * FinancialAssetBalanceTypeCode.mmTreasuriesAndAgenciesDebentures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmIOETTEMortgage
 * FinancialAssetBalanceTypeCode.mmIOETTEMortgage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmMortgagePrivatePlacement
 * FinancialAssetBalanceTypeCode.mmMortgagePrivatePlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmMunicipalBond
 * FinancialAssetBalanceTypeCode.mmMunicipalBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmStudentLoanMarketingAssociation
 * FinancialAssetBalanceTypeCode.mmStudentLoanMarketingAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmShortTermInvestmentFund
 * FinancialAssetBalanceTypeCode.mmShortTermInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmTreasuryStrips
 * FinancialAssetBalanceTypeCode.mmTreasuryStrips}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmTimeDeposit
 * FinancialAssetBalanceTypeCode.mmTimeDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmUnitizedBondsAndWarrants
 * FinancialAssetBalanceTypeCode.mmUnitizedBondsAndWarrants}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmUnitizedBonds
 * FinancialAssetBalanceTypeCode.mmUnitizedBonds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmVariableRateDiscountNote
 * FinancialAssetBalanceTypeCode.mmVariableRateDiscountNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmCatsTigersLions
 * FinancialAssetBalanceTypeCode.mmCatsTigersLions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmForwardBonds
 * FinancialAssetBalanceTypeCode.mmForwardBonds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmForwardRateAgreement
 * FinancialAssetBalanceTypeCode.mmForwardRateAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmRepurchaseAgreement
 * FinancialAssetBalanceTypeCode.mmRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmReverseRepurchaseAgreement
 * FinancialAssetBalanceTypeCode.mmReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmTripartyRepurchaseAgreement
 * FinancialAssetBalanceTypeCode.mmTripartyRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmTripartyReverseRepurchaseAgreement
 * FinancialAssetBalanceTypeCode.mmTripartyReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmFXForward
 * FinancialAssetBalanceTypeCode.mmFXForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmFXSpot
 * FinancialAssetBalanceTypeCode.mmFXSpot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmFXProfit
 * FinancialAssetBalanceTypeCode.mmFXProfit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode#mmFXLoss
 * FinancialAssetBalanceTypeCode.mmFXLoss}</li>
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
 * <li>"OINT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialAssetBalanceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies balances of assets and other balances."</li>
 * </ul>
 */
public class FinancialAssetBalanceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance attributed to other financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OINT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherFinancialInstruments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to other financial instruments."</li>
	 * </ul>
	 */
	public static final MMCode mmOtherFinancialInstruments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherFinancialInstruments";
			definition = "Balance attributed to other financial instruments.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "OINT";
		}
	};
	/**
	 * Balance attributed to settled cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to settled cash."</li>
	 * </ul>
	 */
	public static final MMCode mmSettledCash = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledCash";
			definition = "Balance attributed to settled cash.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "SCAS";
		}
	};
	/**
	 * Balance attributed to accrued income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACRU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to accrued income."</li>
	 * </ul>
	 */
	public static final MMCode mmAccruedIncome = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedIncome";
			definition = "Balance attributed to accrued income.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "ACRU";
		}
	};
	/**
	 * Balance attributed to foreign exchange profit or loss.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FXTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to foreign exchange profit or loss."</li>
	 * </ul>
	 */
	public static final MMCode mmFXTransaction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXTransaction";
			definition = "Balance attributed to foreign exchange profit or loss.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FXTR";
		}
	};
	/**
	 * Balance attributed to cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to cash."</li>
	 * </ul>
	 */
	public static final MMCode mmCash = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Balance attributed to cash.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Balance attributed to treasury inflated protected securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryInflatedProtectedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance attributed to treasury inflated protected securities."</li>
	 * </ul>
	 */
	public static final MMCode mmTreasuryInflatedProtectedSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryInflatedProtectedSecurity";
			definition = "Balance attributed to treasury inflated protected securities.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "TIPS";
		}
	};
	/**
	 * Balance attributed to equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQUI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to equities."</li>
	 * </ul>
	 */
	public static final MMCode mmEquity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Balance attributed to equities.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "EQUI";
		}
	};
	/**
	 * Balance attributed to common stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSTK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to common stock."</li>
	 * </ul>
	 */
	public static final MMCode mmCommonStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonStock";
			definition = "Balance attributed to common stock.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CSTK";
		}
	};
	/**
	 * Balance attributed to preferred stock.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferredStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to preferred stock."</li>
	 * </ul>
	 */
	public static final MMCode mmPreferredStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferredStock";
			definition = "Balance attributed to preferred stock.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "PREF";
		}
	};
	/**
	 * Balance attributed to mutual funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MFUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MutualFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to mutual funds."</li>
	 * </ul>
	 */
	public static final MMCode mmMutualFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MutualFund";
			definition = "Balance attributed to mutual funds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "MFUN";
		}
	};
	/**
	 * Balance attributed to exchange traded funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XFUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to exchange traded funds."</li>
	 * </ul>
	 */
	public static final MMCode mmExchangeTradedFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFund";
			definition = "Balance attributed to exchange traded funds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "XFUN";
		}
	};
	/**
	 * Balance attributed to rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RGHT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to rights."</li>
	 * </ul>
	 */
	public static final MMCode mmRights = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rights";
			definition = "Balance attributed to rights.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "RGHT";
		}
	};
	/**
	 * Balance attributed to warrants.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to warrants."</li>
	 * </ul>
	 */
	public static final MMCode mmWarrant = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warrant";
			definition = "Balance attributed to warrants.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "WARR";
		}
	};
	/**
	 * Balance attributed to bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to bonds."</li>
	 * </ul>
	 */
	public static final MMCode mmBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			definition = "Balance attributed to bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "BOND";
		}
	};
	/**
	 * Balance attributed to convertible bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to convertible bonds."</li>
	 * </ul>
	 */
	public static final MMCode mmConvertibleBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleBond";
			definition = "Balance attributed to convertible bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Balance attributed to corporate bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to corporate bonds."</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateBond";
			definition = "Balance attributed to corporate bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CBND";
		}
	};
	/**
	 * Balance attributed to government bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to government bonds."</li>
	 * </ul>
	 */
	public static final MMCode mmGovernmentBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentBond";
			definition = "Balance attributed to government bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "GBND";
		}
	};
	/**
	 * Balance attributed to futures.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to futures."</li>
	 * </ul>
	 */
	public static final MMCode mmFuture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Future";
			definition = "Balance attributed to futures.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * Balance attributed to options.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to options."</li>
	 * </ul>
	 */
	public static final MMCode mmOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Balance attributed to options.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * Balance attributed to swaps.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to swaps."</li>
	 * </ul>
	 */
	public static final MMCode mmSwap = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Swap";
			definition = "Balance attributed to swaps.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * Balance attributed to currency exchange contracts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to currency exchange contracts."</li>
	 * </ul>
	 */
	public static final MMCode mmCurrencyExchange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Balance attributed to currency exchange contracts.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CUEX";
		}
	};
	/**
	 * Balance attributed to foreign investments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FOIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignInvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to foreign investments."</li>
	 * </ul>
	 */
	public static final MMCode mmForeignInvestment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignInvestment";
			definition = "Balance attributed to foreign investments.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FOIV";
		}
	};
	/**
	 * Balance attributed to gold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GOLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to gold."</li>
	 * </ul>
	 */
	public static final MMCode mmGold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Gold";
			definition = "Balance attributed to gold.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "GOLD";
		}
	};
	/**
	 * Balance attributed to property.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Property"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to property."</li>
	 * </ul>
	 */
	public static final MMCode mmProperty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Property";
			definition = "Balance attributed to property.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "PROP";
		}
	};
	/**
	 * Balance attributed to bankers acceptances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BAAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankersAcceptance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to bankers acceptances."</li>
	 * </ul>
	 */
	public static final MMCode mmBankersAcceptance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankersAcceptance";
			definition = "Balance attributed to bankers acceptances.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "BAAP";
		}
	};
	/**
	 * Balance attributed to syndicated bank loans
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SYBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyndicatedBankLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to syndicated bank loans"</li>
	 * </ul>
	 */
	public static final MMCode mmSyndicatedBankLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicatedBankLoan";
			definition = "Balance attributed to syndicated bank loans";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "SYBL";
		}
	};
	/**
	 * Balance attributed to collateralised bond obligations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBOO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedBondObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to collateralised bond obligations."</li>
	 * </ul>
	 */
	public static final MMCode mmCollateralisedBondObligation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedBondObligation";
			definition = "Balance attributed to collateralised bond obligations.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CBOO";
		}
	};
	/**
	 * Balance attributed to certificates of deposits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to certificates of deposits."</li>
	 * </ul>
	 */
	public static final MMCode mmCertificateOfDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDeposit";
			definition = "Balance attributed to certificates of deposits.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CEOD";
		}
	};
	/**
	 * Balance attributed to collateralised debt obligations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDEO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedDebtObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to collateralised debt obligations."</li>
	 * </ul>
	 */
	public static final MMCode mmCollateralisedDebtObligation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedDebtObligation";
			definition = "Balance attributed to collateralised debt obligations.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CDEO";
		}
	};
	/**
	 * Balance attributed to collateralised loan obligations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedLoanObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to collateralised loan obligations."</li>
	 * </ul>
	 */
	public static final MMCode mmCollateralisedLoanObligation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedLoanObligation";
			definition = "Balance attributed to collateralised loan obligations.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CLOB";
		}
	};
	/**
	 * Balance attributed to collateralised mortgage obligations
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMOO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedMortgageObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to collateralised mortgage obligations"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollateralisedMortgageObligation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedMortgageObligation";
			definition = "Balance attributed to collateralised mortgage obligations";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CMOO";
		}
	};
	/**
	 * Balance attributed to commercial paper.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommericalPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to commercial paper."</li>
	 * </ul>
	 */
	public static final MMCode mmCommericalPaper = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommericalPaper";
			definition = "Balance attributed to commercial paper.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "COPR";
		}
	};
	/**
	 * Balance attributed to corporate private placements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPPE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporatePrivatePlacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to corporate private placements."</li>
	 * </ul>
	 */
	public static final MMCode mmCorporatePrivatePlacement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporatePrivatePlacement";
			definition = "Balance attributed to corporate private placements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "CPPE";
		}
	};
	/**
	 * Balance attributed to discount notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to discount notes."</li>
	 * </ul>
	 */
	public static final MMCode mmDiscountNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountNote";
			definition = "Balance attributed to discount notes.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Balance attributed to federal agency discount notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalAgencyDiscountNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to federal agency discount notes."</li>
	 * </ul>
	 */
	public static final MMCode mmFederalAgencyDiscountNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalAgencyDiscountNote";
			definition = "Balance attributed to federal agency discount notes.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FEAD";
		}
	};
	/**
	 * Balance attributed to federal housing authorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEHA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalHousingAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to federal housing authorities."</li>
	 * </ul>
	 */
	public static final MMCode mmFederalHousingAuthority = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalHousingAuthority";
			definition = "Balance attributed to federal housing authorities.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FEHA";
		}
	};
	/**
	 * Balance attributed to federal home loans.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEHL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalHomeLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to federal home loans."</li>
	 * </ul>
	 */
	public static final MMCode mmFederalHomeLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalHomeLoan";
			definition = "Balance attributed to federal home loans.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FEHL";
		}
	};
	/**
	 * Balance attributed to federal national mortgage associations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FederalNationalMortgageAssociation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance attributed to federal national mortgage associations."</li>
	 * </ul>
	 */
	public static final MMCode mmFederalNationalMortgageAssociation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FederalNationalMortgageAssociation";
			definition = "Balance attributed to federal national mortgage associations.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FNMA";
		}
	};
	/**
	 * Balance attributed to floating rate notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatingRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to floating rate notes."</li>
	 * </ul>
	 */
	public static final MMCode mmFloatingRateNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateNote";
			definition = "Balance attributed to floating rate notes.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FLNO";
		}
	};
	/**
	 * Balance attributed to the government national mortgage association.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GNMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentNationalMortgageAssociation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance attributed to the government national mortgage association."</li>
	 * </ul>
	 */
	public static final MMCode mmGovernmentNationalMortgageAssociation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentNationalMortgageAssociation";
			definition = "Balance attributed to the government national mortgage association.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "GNMA";
		}
	};
	/**
	 * Balance attributed to treasuries and agencies debentures
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAAB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuriesAndAgenciesDebentures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to treasuries and agencies debentures"</li>
	 * </ul>
	 */
	public static final MMCode mmTreasuriesAndAgenciesDebentures = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuriesAndAgenciesDebentures";
			definition = "Balance attributed to treasuries and agencies debentures";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "TAAB";
		}
	};
	/**
	 * Balance attributed to IOETTE mortgages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IETM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IOETTEMortgage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to IOETTE mortgages."</li>
	 * </ul>
	 */
	public static final MMCode mmIOETTEMortgage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IOETTEMortgage";
			definition = "Balance attributed to IOETTE mortgages.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "IETM";
		}
	};
	/**
	 * Balance attributed to mortgage private placements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MPRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgagePrivatePlacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to mortgage private placements."</li>
	 * </ul>
	 */
	public static final MMCode mmMortgagePrivatePlacement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgagePrivatePlacement";
			definition = "Balance attributed to mortgage private placements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "MPRP";
		}
	};
	/**
	 * Balance attributed to municipal bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MBON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MunicipalBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to municipal bonds."</li>
	 * </ul>
	 */
	public static final MMCode mmMunicipalBond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MunicipalBond";
			definition = "Balance attributed to municipal bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "MBON";
		}
	};
	/**
	 * Balance attributed to student loan marketing associations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StudentLoanMarketingAssociation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance attributed to student loan marketing associations."</li>
	 * </ul>
	 */
	public static final MMCode mmStudentLoanMarketingAssociation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StudentLoanMarketingAssociation";
			definition = "Balance attributed to student loan marketing associations.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "SLMA";
		}
	};
	/**
	 * Balance attributed to short term investment funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STIF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermInvestmentFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to short term investment funds."</li>
	 * </ul>
	 */
	public static final MMCode mmShortTermInvestmentFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortTermInvestmentFund";
			definition = "Balance attributed to short term investment funds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "STIF";
		}
	};
	/**
	 * Balance attributed to treasury strips.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TSTP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryStrips"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to treasury strips."</li>
	 * </ul>
	 */
	public static final MMCode mmTreasuryStrips = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryStrips";
			definition = "Balance attributed to treasury strips.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "TSTP";
		}
	};
	/**
	 * Balance attributed to time deposits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to time deposits."</li>
	 * </ul>
	 */
	public static final MMCode mmTimeDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeDeposit";
			definition = "Balance attributed to time deposits.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "TIDE";
		}
	};
	/**
	 * Balance attributed to unitized bonds and warrants.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNBW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitizedBondsAndWarrants"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to unitized bonds and warrants."</li>
	 * </ul>
	 */
	public static final MMCode mmUnitizedBondsAndWarrants = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitizedBondsAndWarrants";
			definition = "Balance attributed to unitized bonds and warrants.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "UNBW";
		}
	};
	/**
	 * Balance attributed to unitized bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitizedBonds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to unitized bonds."</li>
	 * </ul>
	 */
	public static final MMCode mmUnitizedBonds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitizedBonds";
			definition = "Balance attributed to unitized bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "UNBO";
		}
	};
	/**
	 * Balance attributed to variable rate discount notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VRDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateDiscountNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to variable rate discount notes."</li>
	 * </ul>
	 */
	public static final MMCode mmVariableRateDiscountNote = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateDiscountNote";
			definition = "Balance attributed to variable rate discount notes.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "VRDN";
		}
	};
	/**
	 * Balance attributed to cats, lions and tigers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZOOO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CatsTigersLions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to cats, lions and tigers."</li>
	 * </ul>
	 */
	public static final MMCode mmCatsTigersLions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CatsTigersLions";
			definition = "Balance attributed to cats, lions and tigers.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "ZOOO";
		}
	};
	/**
	 * Balance attributed to forwards - bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FWBO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardBonds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to forwards - bonds."</li>
	 * </ul>
	 */
	public static final MMCode mmForwardBonds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardBonds";
			definition = "Balance attributed to forwards - bonds.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FWBO";
		}
	};
	/**
	 * Balance attributed to forward rate agreements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardRateAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to forward rate agreements."</li>
	 * </ul>
	 */
	public static final MMCode mmForwardRateAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardRateAgreement";
			definition = "Balance attributed to forward rate agreements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FRAG";
		}
	};
	/**
	 * Balance attributed to repurchase agreements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to repurchase agreements."</li>
	 * </ul>
	 */
	public static final MMCode mmRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAgreement";
			definition = "Balance attributed to repurchase agreements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Balance attributed to reverse repurchase agreements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XREP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to reverse repurchase agreements."</li>
	 * </ul>
	 */
	public static final MMCode mmReverseRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepurchaseAgreement";
			definition = "Balance attributed to reverse repurchase agreements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "XREP";
		}
	};
	/**
	 * Balance attributed to triparty repurchase agreements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TREP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyRepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to triparty repurchase agreements."</li>
	 * </ul>
	 */
	public static final MMCode mmTripartyRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyRepurchaseAgreement";
			definition = "Balance attributed to triparty repurchase agreements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "TREP";
		}
	};
	/**
	 * Balance attributed to triparty reverse repurchase agreements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RXRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyReverseRepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance attributed to triparty reverse repurchase agreements."</li>
	 * </ul>
	 */
	public static final MMCode mmTripartyReverseRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyReverseRepurchaseAgreement";
			definition = "Balance attributed to triparty reverse repurchase agreements.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "RXRP";
		}
	};
	/**
	 * Balance attributed to foreign exchange forwards.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FXFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to foreign exchange forwards."</li>
	 * </ul>
	 */
	public static final MMCode mmFXForward = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXForward";
			definition = "Balance attributed to foreign exchange forwards.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FXFD";
		}
	};
	/**
	 * Balance attributed to foreign exchange spots.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FXSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXSpot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to foreign exchange spots."</li>
	 * </ul>
	 */
	public static final MMCode mmFXSpot = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXSpot";
			definition = "Balance attributed to foreign exchange spots.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FXSP";
		}
	};
	/**
	 * Balance attributed to foreign exchange profit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FXPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXProfit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to foreign exchange profit."</li>
	 * </ul>
	 */
	public static final MMCode mmFXProfit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXProfit";
			definition = "Balance attributed to foreign exchange profit.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FXPR";
		}
	};
	/**
	 * Balance attributed to foreign exchange loss.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetBalanceTypeCode
	 * FinancialAssetBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FXLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FXLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance attributed to foreign exchange loss."</li>
	 * </ul>
	 */
	public static final MMCode mmFXLoss = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FXLoss";
			definition = "Balance attributed to foreign exchange loss.";
			owner_lazy = () -> FinancialAssetBalanceTypeCode.mmObject();
			codeName = "FXLO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("OINT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialAssetBalanceTypeCode";
				definition = "Specifies balances of assets and other balances.";
				code_lazy = () -> Arrays.asList(FinancialAssetBalanceTypeCode.mmOtherFinancialInstruments, FinancialAssetBalanceTypeCode.mmSettledCash, FinancialAssetBalanceTypeCode.mmAccruedIncome,
						FinancialAssetBalanceTypeCode.mmFXTransaction, FinancialAssetBalanceTypeCode.mmCash, FinancialAssetBalanceTypeCode.mmTreasuryInflatedProtectedSecurity, FinancialAssetBalanceTypeCode.mmEquity,
						FinancialAssetBalanceTypeCode.mmCommonStock, FinancialAssetBalanceTypeCode.mmPreferredStock, FinancialAssetBalanceTypeCode.mmMutualFund, FinancialAssetBalanceTypeCode.mmExchangeTradedFund,
						FinancialAssetBalanceTypeCode.mmRights, FinancialAssetBalanceTypeCode.mmWarrant, FinancialAssetBalanceTypeCode.mmBond, FinancialAssetBalanceTypeCode.mmConvertibleBond, FinancialAssetBalanceTypeCode.mmCorporateBond,
						FinancialAssetBalanceTypeCode.mmGovernmentBond, FinancialAssetBalanceTypeCode.mmFuture, FinancialAssetBalanceTypeCode.mmOption, FinancialAssetBalanceTypeCode.mmSwap, FinancialAssetBalanceTypeCode.mmCurrencyExchange,
						FinancialAssetBalanceTypeCode.mmForeignInvestment, FinancialAssetBalanceTypeCode.mmGold, FinancialAssetBalanceTypeCode.mmProperty, FinancialAssetBalanceTypeCode.mmBankersAcceptance,
						FinancialAssetBalanceTypeCode.mmSyndicatedBankLoan, FinancialAssetBalanceTypeCode.mmCollateralisedBondObligation, FinancialAssetBalanceTypeCode.mmCertificateOfDeposit,
						FinancialAssetBalanceTypeCode.mmCollateralisedDebtObligation, FinancialAssetBalanceTypeCode.mmCollateralisedLoanObligation, FinancialAssetBalanceTypeCode.mmCollateralisedMortgageObligation,
						FinancialAssetBalanceTypeCode.mmCommericalPaper, FinancialAssetBalanceTypeCode.mmCorporatePrivatePlacement, FinancialAssetBalanceTypeCode.mmDiscountNote, FinancialAssetBalanceTypeCode.mmFederalAgencyDiscountNote,
						FinancialAssetBalanceTypeCode.mmFederalHousingAuthority, FinancialAssetBalanceTypeCode.mmFederalHomeLoan, FinancialAssetBalanceTypeCode.mmFederalNationalMortgageAssociation,
						FinancialAssetBalanceTypeCode.mmFloatingRateNote, FinancialAssetBalanceTypeCode.mmGovernmentNationalMortgageAssociation, FinancialAssetBalanceTypeCode.mmTreasuriesAndAgenciesDebentures,
						FinancialAssetBalanceTypeCode.mmIOETTEMortgage, FinancialAssetBalanceTypeCode.mmMortgagePrivatePlacement, FinancialAssetBalanceTypeCode.mmMunicipalBond,
						FinancialAssetBalanceTypeCode.mmStudentLoanMarketingAssociation, FinancialAssetBalanceTypeCode.mmShortTermInvestmentFund, FinancialAssetBalanceTypeCode.mmTreasuryStrips, FinancialAssetBalanceTypeCode.mmTimeDeposit,
						FinancialAssetBalanceTypeCode.mmUnitizedBondsAndWarrants, FinancialAssetBalanceTypeCode.mmUnitizedBonds, FinancialAssetBalanceTypeCode.mmVariableRateDiscountNote, FinancialAssetBalanceTypeCode.mmCatsTigersLions,
						FinancialAssetBalanceTypeCode.mmForwardBonds, FinancialAssetBalanceTypeCode.mmForwardRateAgreement, FinancialAssetBalanceTypeCode.mmRepurchaseAgreement, FinancialAssetBalanceTypeCode.mmReverseRepurchaseAgreement,
						FinancialAssetBalanceTypeCode.mmTripartyRepurchaseAgreement, FinancialAssetBalanceTypeCode.mmTripartyReverseRepurchaseAgreement, FinancialAssetBalanceTypeCode.mmFXForward, FinancialAssetBalanceTypeCode.mmFXSpot,
						FinancialAssetBalanceTypeCode.mmFXProfit, FinancialAssetBalanceTypeCode.mmFXLoss);
			}
		});
		return mmObject_lazy.get();
	}
}