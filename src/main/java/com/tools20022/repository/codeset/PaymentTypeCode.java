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
import com.tools20022.repository.codeset.PaymentTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type, or nature, of the payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CashTransaction
 * PaymentTypeCode.mmCashTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#DomesticPayment
 * PaymentTypeCode.mmDomesticPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#DomesticHighValuePayment
 * PaymentTypeCode.mmDomesticHighValuePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#DomesticPriorityPayment
 * PaymentTypeCode.mmDomesticPriorityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CrossBorderPayment
 * PaymentTypeCode.mmCrossBorderPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CrossBorderPriorityPayment
 * PaymentTypeCode.mmCrossBorderPriorityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CrossBorderHighValuePayment
 * PaymentTypeCode.mmCrossBorderHighValuePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#ThirdCurrencyPayment
 * PaymentTypeCode.mmThirdCurrencyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#ThirdCurrencyHighValuePayment
 * PaymentTypeCode.mmThirdCurrencyHighValuePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#ThirdCurrencyPriorityPayment
 * PaymentTypeCode.mmThirdCurrencyPriorityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#TradeSettlementPayment
 * PaymentTypeCode.mmTradeSettlementPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#ForeignExchange
 * PaymentTypeCode.mmForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#EquivalentAmount
 * PaymentTypeCode.mmEquivalentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Loan
 * PaymentTypeCode.mmLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#LoanRepayment
 * PaymentTypeCode.mmLoanRepayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Securities
 * PaymentTypeCode.mmSecurities}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#LockBox
 * PaymentTypeCode.mmLockBox}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Dividend
 * PaymentTypeCode.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CrossedCheque
 * PaymentTypeCode.mmCrossedCheque}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#OpenCheque
 * PaymentTypeCode.mmOpenCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#OrderCheque
 * PaymentTypeCode.mmOrderCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CircularCheque
 * PaymentTypeCode.mmCircularCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#TravellersCheques
 * PaymentTypeCode.mmTravellersCheques}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#BankDraft
 * PaymentTypeCode.mmBankDraft}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CashLetter
 * PaymentTypeCode.mmCashLetter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#DocumentaryCredit
 * PaymentTypeCode.mmDocumentaryCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#BillOfExchange
 * PaymentTypeCode.mmBillOfExchange}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Collection
 * PaymentTypeCode.mmCollection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CashManagementTransfer
 * PaymentTypeCode.mmCashManagementTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#SweepAccount
 * PaymentTypeCode.mmSweepAccount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#TopAccount
 * PaymentTypeCode.mmTopAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#ZeroBalanceAccount
 * PaymentTypeCode.mmZeroBalanceAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#StandingFacilities
 * PaymentTypeCode.mmStandingFacilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#SwiftPayServiceLevelCredit
 * PaymentTypeCode.mmSwiftPayServiceLevelCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#PriorityServiceLevelCredit
 * PaymentTypeCode.mmPriorityServiceLevelCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#StandardServiceLevelCredit
 * PaymentTypeCode.mmStandardServiceLevelCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#LiquidityTransfer
 * PaymentTypeCode.mmLiquidityTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#AdvancePayment
 * PaymentTypeCode.mmAdvancePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#ValueDateAdjustment
 * PaymentTypeCode.mmValueDateAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#DVPGross
 * PaymentTypeCode.mmDVPGross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#DVPNet
 * PaymentTypeCode.mmDVPNet}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Netting
 * PaymentTypeCode.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#LimitPayment
 * PaymentTypeCode.mmLimitPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#BackUp
 * PaymentTypeCode.mmBackUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#ExpressPayment
 * PaymentTypeCode.mmExpressPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CentralBankOperation
 * PaymentTypeCode.mmCentralBankOperation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CLSPayment
 * PaymentTypeCode.mmCLSPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#EuroDomesticPayment
 * PaymentTypeCode.mmEuroDomesticPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#AgriculturalTransfer
 * PaymentTypeCode.mmAgriculturalTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#AlimonyPayment
 * PaymentTypeCode.mmAlimonyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#BalanceRetail
 * PaymentTypeCode.mmBalanceRetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#BonusPayment
 * PaymentTypeCode.mmBonusPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#BrokerageFee
 * PaymentTypeCode.mmBrokerageFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CapitalBuilding
 * PaymentTypeCode.mmCapitalBuilding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CharityPayment
 * PaymentTypeCode.mmCharityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#ChildBenefit
 * PaymentTypeCode.mmChildBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CommercialCredit
 * PaymentTypeCode.mmCommercialCredit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Commission
 * PaymentTypeCode.mmCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#CommodityTransfer
 * PaymentTypeCode.mmCommodityTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Costs
 * PaymentTypeCode.mmCosts}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Copyright
 * PaymentTypeCode.mmCopyright}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#GovernmentPayment
 * PaymentTypeCode.mmGovernmentPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#InstalmentHirePurchaseAgreement
 * PaymentTypeCode.mmInstalmentHirePurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#InsurancePremium
 * PaymentTypeCode.mmInsurancePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#IntraCompanyPayment
 * PaymentTypeCode.mmIntraCompanyPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Interest
 * PaymentTypeCode.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#LicenseFee
 * PaymentTypeCode.mmLicenseFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Metals
 * PaymentTypeCode.mmMetals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#PensionPayment
 * PaymentTypeCode.mmPensionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#PurchaseSaleOfGoods
 * PaymentTypeCode.mmPurchaseSaleOfGoods}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Refund
 * PaymentTypeCode.mmRefund}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Rent
 * PaymentTypeCode.mmRent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Royalties
 * PaymentTypeCode.mmRoyalties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#PurchaseSaleOfServices
 * PaymentTypeCode.mmPurchaseSaleOfServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#SalaryPayment
 * PaymentTypeCode.mmSalaryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#SocialSecurityBenefit
 * PaymentTypeCode.mmSocialSecurityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#StandingOrder
 * PaymentTypeCode.mmStandingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Subscription
 * PaymentTypeCode.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#TreasuryStatePayment
 * PaymentTypeCode.mmTreasuryStatePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#UnemploymentDisabilityBenefit
 * PaymentTypeCode.mmUnemploymentDisabilityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#ValueAddedTaxPayment
 * PaymentTypeCode.mmValueAddedTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#WithHoldingTax
 * PaymentTypeCode.mmWithHoldingTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#TaxPayment
 * PaymentTypeCode.mmTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Miscellaneous
 * PaymentTypeCode.mmMiscellaneous}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#OvernightDeposit
 * PaymentTypeCode.mmOvernightDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode#MarginalLending
 * PaymentTypeCode.mmMarginalLending}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentTypeCode#Other
 * PaymentTypeCode.mmOther}</li>
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
 * <li>"CSH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type, or nature, of the payment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is a withdrawal/deposit of cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a withdrawal/deposit of cash."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode CashTransaction = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashTransaction";
			definition = "Transaction is a withdrawal/deposit of cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CSH";
		}
	};
	/**
	 * Payment has an origin and a destination in the same country, and is made
	 * in the currency of that country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment has an origin and a destination in the same country, and is made in the currency of that country."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode DomesticPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DomesticPayment";
			definition = "Payment has an origin and a destination in the same country, and is made in the currency of that country.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "DPS";
		}
	};
	/**
	 * Transaction is a high value payment that has an origin and a destination
	 * in the same country and is made in the currency of that country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticHighValuePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a high value payment that has an origin and a destination in the same country and is made in the currency of that country."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode DomesticHighValuePayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DomesticHighValuePayment";
			definition = "Transaction is a high value payment that has an origin and a destination in the same country and is made in the currency of that country.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "DPH";
		}
	};
	/**
	 * Transaction is a priority payment that has an origin and a destination in
	 * the same country and is made in the currency of that country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticPriorityPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a priority payment that has an origin and a destination in the same country and is made in the currency of that country."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode DomesticPriorityPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DomesticPriorityPayment";
			definition = "Transaction is a priority payment that has an origin and a destination in the same country and is made in the currency of that country.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "DPP";
		}
	};
	/**
	 * Payment has an origin in one country, a destination in another, and is
	 * made in the currency of either the origin or destination country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossBorderPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment has an origin in one country, a destination in another, and is made in the currency of either the origin or destination country."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode CrossBorderPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossBorderPayment";
			definition = "Payment has an origin in one country, a destination in another, and is made in the currency of either the origin or destination country.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CBS";
		}
	};
	/**
	 * Transaction is a priority payment that has an origin in one country and a
	 * destination in another and is made in the currency of either the origin
	 * or destination country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossBorderPriorityPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a priority payment that has an origin in one country and a destination in another and is made in the currency of either the origin or destination country."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode CrossBorderPriorityPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossBorderPriorityPayment";
			definition = "Transaction is a priority payment that has an origin in one country and a destination in another and is made in the currency of either the origin or destination country.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CBP";
		}
	};
	/**
	 * Transaction is a high value payment that has an origin in one country and
	 * a destination in another country and is made in the currency of either
	 * the origin or destination country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossBorderHighValuePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a high value payment that has an origin in one country and a destination in another country and is made in the currency of either the origin or destination country."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode CrossBorderHighValuePayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossBorderHighValuePayment";
			definition = "Transaction is a high value payment that has an origin in one country and a destination in another country and is made in the currency of either the origin or destination country.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CBH";
		}
	};
	/**
	 * Transaction is a payment that is made in a third currency to the origin
	 * and destination countries. The origin and destination countries may be
	 * one and the same country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdCurrencyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment that is made in a third currency to the origin and destination countries. The origin and destination countries may be one and the same country."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode ThirdCurrencyPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ThirdCurrencyPayment";
			definition = "Transaction is a payment that is made in a third currency to the origin and destination countries. The origin and destination countries may be one and the same country.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "TCS";
		}
	};
	/**
	 * Transaction is a high value payment that is made in a third currency to
	 * the origin and destination countries. The origin and destination
	 * countries may be one and the same country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdCurrencyHighValuePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a high value payment that is made in a third currency to the origin and destination countries. The origin and destination countries may be one and the same country."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode ThirdCurrencyHighValuePayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ThirdCurrencyHighValuePayment";
			definition = "Transaction is a high value payment that is made in a third currency to the origin and destination countries. The origin and destination countries may be one and the same country.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "TCH";
		}
	};
	/**
	 * Payment is made in a third currency to the origin and destination
	 * countries. The origin and destination countries may be the same country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdCurrencyPriorityPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is made in a third currency to the origin and destination countries. The origin and destination countries may be the same country."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode ThirdCurrencyPriorityPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ThirdCurrencyPriorityPayment";
			definition = "Payment is made in a third currency to the origin and destination countries. The origin and destination countries may be the same country.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "TCP";
		}
	};
	/**
	 * Transaction is the settlement of a trade, eg, a securities transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlementPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is the settlement of a trade, eg, a securities transaction."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode TradeSettlementPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlementPayment";
			definition = "Transaction is the settlement of a trade, eg, a securities transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "COR";
		}
	};
	/**
	 * Transaction isthe settlement of a foreign exchange deal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction isthe settlement of a foreign exchange deal."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode ForeignExchange = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchange";
			definition = "Transaction isthe settlement of a foreign exchange deal.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "FEX";
		}
	};
	/**
	 * Transaction is an equivalent amount relative to a currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquivalentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is an equivalent amount relative to a currency conversion."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode EquivalentAmount = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EquivalentAmount";
			definition = "Transaction is an equivalent amount relative to a currency conversion.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "EQA";
		}
	};
	/**
	 * Transaction is the payment of a specific amount of money lent by a
	 * creditor/lender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is the payment of a specific amount of money lent by a creditor/lender."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode Loan = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Loan";
			definition = "Transaction is the payment of a specific amount of money lent by a creditor/lender.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "LOA";
		}
	};
	/**
	 * Transaction is an amount of money transferred in repayment of loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoanRepayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is an amount of money transferred in repayment of loan."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode LoanRepayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LoanRepayment";
			definition = "Transaction is an amount of money transferred in repayment of loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "LOR";
		}
	};
	/**
	 * Transaction is a payment of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of securities."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Securities = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Securities";
			definition = "Transaction is a payment of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "SEC";
		}
	};
	/**
	 * Transaction is a payment(s) resulting from a lock box service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LBX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LockBox"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment(s) resulting from a lock box service."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode LockBox = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LockBox";
			definition = "Transaction is a payment(s) resulting from a lock box service.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "LBX";
		}
	};
	/**
	 * Transaction is a payment of dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of dividends."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Dividend = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Transaction is a payment of dividends.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "DIV";
		}
	};
	/**
	 * Transaction is a crossed cheque. A crossed check has two parallel lines
	 * across its face, indicating that the cheque must be paid into an account
	 * and not cashed over the counter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossedCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a crossed cheque.  A crossed check has two parallel lines across its face, indicating that the cheque must be paid into an account and not cashed over the counter."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode CrossedCheque = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CrossedCheque";
			definition = "Transaction is a crossed cheque.  A crossed check has two parallel lines across its face, indicating that the cheque must be paid into an account and not cashed over the counter.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CSQ";
		}
	};
	/**
	 * Transaction is an uncrossed cheque that can be cashed at the bank of
	 * origin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OCQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is an uncrossed cheque that can be cashed at the bank of origin."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode OpenCheque = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpenCheque";
			definition = "Transaction is an uncrossed cheque that can be cashed at the bank of origin.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "OCQ";
		}
	};
	/**
	 * Transaction is a cheque made payable to a named recipient 'or order'
	 * enabling the creditor to either deposit it in an account or endorse it to
	 * a third party, ie, transfer the rights to the cheque by signing it on the
	 * reverse.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a cheque made payable to a named recipient 'or order' enabling the creditor to either deposit it in an account or endorse it to a third party, ie, transfer the rights to the cheque by signing it on the reverse."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode OrderCheque = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderCheque";
			definition = "Transaction is a cheque made payable to a named recipient 'or order' enabling the creditor to either deposit it in an account or endorse it to a third party, ie, transfer the rights to the cheque by signing it on the reverse.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "ODC";
		}
	};
	/**
	 * Transaction is an instruction from a bank to its correspondent bank to
	 * pay the creditor a stated sum of money on presentation of a means of
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CircularCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is an instruction from a bank to its correspondent bank to pay the creditor a stated sum of money on presentation of a means of identification."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode CircularCheque = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CircularCheque";
			definition = "Transaction is an instruction from a bank to its correspondent bank to pay the creditor a stated sum of money on presentation of a means of identification.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CCQ";
		}
	};
	/**
	 * Transaction is a payment resulting from travellers cheques.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TravellersCheques"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment resulting from travellers cheques."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode TravellersCheques = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TravellersCheques";
			definition = "Transaction is a payment resulting from travellers cheques.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "TCK";
		}
	};
	/**
	 * Transaction is a cheque drawn by a bank on itself or its agent. A person
	 * who owes money to another buys the draft from a bank for cash and hands
	 * it to the creditor who need have no fear that it might be dishonoured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankDraft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a cheque drawn by a bank on itself or its agent. A person who owes money to another buys the draft from a bank for cash and hands it to the creditor who need have no fear that it might be dishonoured."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode BankDraft = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankDraft";
			definition = "Transaction is a cheque drawn by a bank on itself or its agent. A person who owes money to another buys the draft from a bank for cash and hands it to the creditor who need have no fear that it might be dishonoured.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "BKD";
		}
	};
	/**
	 * Transaction is a cash letter. A cash letter is a payment instrument in
	 * the form of a covering letter, whereby a financial institution, ie, the
	 * remitting bank, requests credit for one or more financial documents under
	 * usual reserve, ie, subject to final payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashLetter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a cash letter.  A cash letter is a payment instrument in the form of a covering letter, whereby a financial institution, ie, the remitting bank, requests credit for one or more financial documents under usual reserve, ie, subject to final payment."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode CashLetter = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashLetter";
			definition = "Transaction is a cash letter.  A cash letter is a payment instrument in the form of a covering letter, whereby a financial institution, ie, the remitting bank, requests credit for one or more financial documents under usual reserve, ie, subject to final payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CLR";
		}
	};
	/**
	 * Transaction is a documentary credit from one banker to another,
	 * authorising the payment of a specified sum of money to the person named
	 * in the document, based on specified conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentaryCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a documentary credit from one banker to another, authorising the payment of a specified sum of money to the person named in the document, based on specified conditions."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode DocumentaryCredit = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DocumentaryCredit";
			definition = "Transaction is a documentary credit from one banker to another, authorising the payment of a specified sum of money to the person named in the document, based on specified conditions.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "DCR";
		}
	};
	/**
	 * Transaction is a written order from a drawer to a drawee to pay a
	 * specified sum of money upon demand, or on a specified date, to the drawer
	 * or to a third party specified by the drawer. A bill of exchange is also
	 * called a draft.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillOfExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a written order from a drawer to a drawee to pay a specified sum of money upon demand, or on a specified date, to the drawer or to a third party specified by the drawer. A bill of exchange is also called a draft."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode BillOfExchange = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillOfExchange";
			definition = "Transaction is a written order from a drawer to a drawee to pay a specified sum of money upon demand, or on a specified date, to the drawer or to a third party specified by the drawer. A bill of exchange is also called a draft.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "BOE";
		}
	};
	/**
	 * Transaction is a collection. A collection is the act of sending a cheque,
	 * bill of exchange or another financial instrument to the prospective
	 * financial institution for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a collection.  A collection is the act of sending a cheque, bill of exchange or another financial instrument to the prospective financial institution for payment."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode Collection = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Collection";
			definition = "Transaction is a collection.  A collection is the act of sending a cheque, bill of exchange or another financial instrument to the prospective financial institution for payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "COL";
		}
	};
	/**
	 * Transaction is a general cash management instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashManagementTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a general cash management instruction."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode CashManagementTransfer = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashManagementTransfer";
			definition = "Transaction is a general cash management instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CMT";
		}
	};
	/**
	 * Transaction relates to a cash management instruction, requesting a sweep
	 * of the account of the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SweepAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction relates to a cash management instruction, requesting a sweep of the account of the debtor."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode SweepAccount = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SweepAccount";
			definition = "Transaction relates to a cash management instruction, requesting a sweep of the account of the debtor.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CSW";
		}
	};
	/**
	 * Transaction is a cash management instruction, requesting to top the
	 * account of the debtor above a certain floor amount. The floor amount, if
	 * not pre-agreed by the parties involved, may be specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a cash management instruction, requesting to top the account of the debtor above a certain floor amount. The floor amount, if not pre-agreed by the parties involved, may be specified."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode TopAccount = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TopAccount";
			definition = "Transaction is a cash management instruction, requesting to top the account of the debtor above a certain floor amount. The floor amount, if not pre-agreed by the parties involved, may be specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CTO";
		}
	};
	/**
	 * Transaction is a cash management instruction, requesting to zero balance
	 * the account of the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CZB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZeroBalanceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a cash management instruction, requesting to zero balance the account of the debtor."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode ZeroBalanceAccount = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ZeroBalanceAccount";
			definition = "Transaction is a cash management instruction, requesting to zero balance the account of the debtor.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CZB";
		}
	};
	/**
	 * Payment is linked to overnight deposits and the marginal lending
	 * facility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingFacilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is linked to overnight deposits and the marginal lending facility."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode StandingFacilities = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingFacilities";
			definition = "Payment is linked to overnight deposits and the marginal lending facility.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "STF";
		}
	};
	/**
	 * Transaction is a credit transfer to be processed according to the
	 * SWIFTPay Service Level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwiftPayServiceLevelCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a credit transfer to be processed according to the SWIFTPay Service Level."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode SwiftPayServiceLevelCredit = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwiftPayServiceLevelCredit";
			definition = "Transaction is a credit transfer to be processed according to the SWIFTPay Service Level.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "PAY";
		}
	};
	/**
	 * Transaction is a credit transfer to be processed according to the
	 * Priority Service Level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityServiceLevelCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a credit transfer to be processed according to the Priority Service Level."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode PriorityServiceLevelCredit = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriorityServiceLevelCredit";
			definition = "Transaction is a credit transfer to be processed according to the Priority Service Level.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "PRI";
		}
	};
	/**
	 * Transaction is a credit transfer to be processed according to the
	 * Standard Service Level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardServiceLevelCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a credit transfer to be processed according to the Standard Service Level."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode StandardServiceLevelCredit = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandardServiceLevelCredit";
			definition = "Transaction is a credit transfer to be processed according to the Standard Service Level.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "STD";
		}
	};
	/**
	 * Payment is made to transfer liquidity to/from the settlement account of a
	 * member, to/from the current account held at the central institution or
	 * any other institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is made to transfer liquidity to/from the settlement account of a member, to/from the current account held at the central institution or any other institution."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode LiquidityTransfer = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiquidityTransfer";
			definition = "Payment is made to transfer liquidity to/from the settlement account of a member, to/from the current account held at the central institution or any other institution.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "LIQ";
		}
	};
	/**
	 * Transaction is a payment made in advance or as an advance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvancePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment made in advance or as an advance."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode AdvancePayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdvancePayment";
			definition = "Transaction is a payment made in advance or as an advance.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "ADV";
		}
	};
	/**
	 * Transaction reverses a previously incorrectly value dated entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction reverses a previously incorrectly value dated entry."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode ValueDateAdjustment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDateAdjustment";
			definition = "Transaction reverses a previously incorrectly value dated entry.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "VDA";
		}
	};
	/**
	 * Gross cash payment offsetting the amount owed/due for a securities
	 * transaction settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DVPGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Gross cash payment offsetting the amount owed/due for a securities transaction settlement."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode DVPGross = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DVPGross";
			definition = "Gross cash payment offsetting the amount owed/due for a securities transaction settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "DPG";
		}
	};
	/**
	 * Net payment offsetting the cash balance due/owed for a series of
	 * securities transactions settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DVPNet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net payment offsetting the cash balance due/owed for a series of securities transactions settlement."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode DVPNet = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DVPNet";
			definition = "Net payment offsetting the cash balance due/owed for a series of securities transactions settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "DPN";
		}
	};
	/**
	 * Transaction is a netting operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a netting operation."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Netting = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Transaction is a netting operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "NET";
		}
	};
	/**
	 * Transaction is a payment that is processed when the pool of liquidity
	 * exceeds the minimum value reserved for an express payment in the RTGSPlus
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment that is processed when the pool of liquidity exceeds the minimum value reserved for an express payment in the RTGSPlus system."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode LimitPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitPayment";
			definition = "Transaction is a payment that is processed when the pool of liquidity exceeds the minimum value reserved for an express payment in the RTGSPlus system.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "LMT";
		}
	};
	/**
	 * Payment is made under the recovery procedure to move liquidity to/from
	 * the settlement account of a member according to the specifications of the
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is made under the recovery procedure to move liquidity to/from the settlement account of a member according to the specifications of the system."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode BackUp = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BackUp";
			definition = "Payment is made under the recovery procedure to move liquidity to/from the settlement account of a member according to the specifications of the system.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "BCK";
		}
	};
	/**
	 * Transaction is a payment that is processed whenever liquidity is
	 * available on the settlement account of a member of the RTGSPlus system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpressPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment that is processed whenever liquidity is available on the settlement account of a member of the RTGSPlus system."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode ExpressPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpressPayment";
			definition = "Transaction is a payment that is processed whenever liquidity is available on the settlement account of a member of the RTGSPlus system.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "EXP";
		}
	};
	/**
	 * Payment is made to settle an operation made with the central bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralBankOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is made to settle an operation made with the central bank."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode CentralBankOperation = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CentralBankOperation";
			definition = "Payment is made to settle an operation made with the central bank.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CTR";
		}
	};
	/**
	 * Payment is linked to CLS activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CLSPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment is linked to CLS activities."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode CLSPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CLSPayment";
			definition = "Payment is linked to CLS activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CLS";
		}
	};
	/**
	 * Transaction is a credit transfer in Euro with its country of origin and
	 * country of destination within the European Union. The origin and
	 * destination countries may be one and the same country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EuroDomesticPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a credit transfer in Euro with its country of origin and country of destination within the European Union. The origin and destination countries may be one and the same country."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode EuroDomesticPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EuroDomesticPayment";
			definition = "Transaction is a credit transfer in Euro with its country of origin and country of destination within the European Union. The origin and destination countries may be one and the same country.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "EUP";
		}
	};
	/**
	 * Transaction is related to the agricultural domain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgriculturalTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to the agricultural domain."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode AgriculturalTransfer = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgriculturalTransfer";
			definition = "Transaction is related to the agricultural domain.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "AGT";
		}
	};
	/**
	 * Transaction is a payment(s) made by one spouse to the other after a
	 * separation or divorce. An alimony payment may be applied to other family
	 * relationships.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlimonyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment(s) made by one spouse to the other after a separation or divorce. An alimony payment may be applied to other family relationships."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode AlimonyPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlimonyPayment";
			definition = "Transaction is a payment(s) made by one spouse to the other after a separation or divorce. An alimony payment may be applied to other family relationships.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "AMY";
		}
	};
	/**
	 * Transaction is a payment offsetting the net cash balance owed/due in a
	 * retail payment system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceRetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment offsetting the net cash balance owed/due in a retail payment system."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode BalanceRetail = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BalanceRetail";
			definition = "Transaction is a payment offsetting the net cash balance owed/due in a retail payment system.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "BAL";
		}
	};
	/**
	 * Net cash payment offsetting the balance due/owed in a retail payment
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash payment offsetting the balance due/owed in a retail payment system."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode BonusPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BonusPayment";
			definition = "Net cash payment offsetting the balance due/owed in a retail payment system.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "BON";
		}
	};
	/**
	 * Transaction is charges levied by a broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerageFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is charges levied by a broker."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode BrokerageFee = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BrokerageFee";
			definition = "Transaction is charges levied by a broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "BRF";
		}
	};
	/**
	 * Transaction is payment into a personal pension scheme for retirement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalBuilding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is payment into a personal pension scheme for retirement."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode CapitalBuilding = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalBuilding";
			definition = "Transaction is payment into a personal pension scheme for retirement.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CBF";
		}
	};
	/**
	 * Transaction is a payment for charity reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CharityPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment for charity reasons."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode CharityPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CharityPayment";
			definition = "Transaction is a payment for charity reasons.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CHR";
		}
	};
	/**
	 * Transaction is a payment made to a parent/guardian to help maintain a
	 * child.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChildBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment made to a parent/guardian to help maintain a child."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode ChildBenefit = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChildBenefit";
			definition = "Transaction is a payment made to a parent/guardian to help maintain a child.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "BEC";
		}
	};
	/**
	 * Transaction is settlement of a commercial credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is settlement of a commercial credit."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode CommercialCredit = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialCredit";
			definition = "Transaction is settlement of a commercial credit.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "COC";
		}
	};
	/**
	 * Transaction is payment of a fee for executing a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is payment of a fee for executing a transaction."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Commission = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Transaction is payment of a fee for executing a transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "COM";
		}
	};
	/**
	 * Transaction is a payment of products traded on a commodity exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommodityTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment of products traded on a commodity exchange."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode CommodityTransfer = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommodityTransfer";
			definition = "Transaction is a payment of products traded on a commodity exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CDT";
		}
	};
	/**
	 * Transaction is apayment of costs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Costs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is apayment of costs."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Costs = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Costs";
			definition = "Transaction is apayment of costs.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "COS";
		}
	};
	/**
	 * Transaction is a payment of copyright.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copyright"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of copyright."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Copyright = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Copyright";
			definition = "Transaction is a payment of copyright.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "CPY";
		}
	};
	/**
	 * Transaction is apayment to or from a government department.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GVT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is apayment to or from a government department."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode GovernmentPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GovernmentPayment";
			definition = "Transaction is apayment to or from a government department.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "GVT";
		}
	};
	/**
	 * Transaction is a payment of an instalment or to the settlement of a
	 * hire-purchase agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IHP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentHirePurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment of an instalment or to the settlement of a hire-purchase agreement."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode InstalmentHirePurchaseAgreement = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstalmentHirePurchaseAgreement";
			definition = "Transaction is a payment of an instalment or to the settlement of a hire-purchase agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "IHP";
		}
	};
	/**
	 * Transaction is a payment of an insurance premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of an insurance premium."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode InsurancePremium = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsurancePremium";
			definition = "Transaction is a payment of an insurance premium.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "INS";
		}
	};
	/**
	 * Transaction is an intra-company payment, ie, a payment between two
	 * companies belonging to the same group.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraCompanyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode IntraCompanyPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntraCompanyPayment";
			definition = "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "INC";
		}
	};
	/**
	 * Transaction is a payment of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of interest."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Interest = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Transaction is a payment of interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "INT";
		}
	};
	/**
	 * Transaction is a payment of a license fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LCF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LicenseFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of a license fee."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode LicenseFee = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LicenseFee";
			definition = "Transaction is a payment of a license fee.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "LCF";
		}
	};
	/**
	 * Transaction is a purchase or sale of metals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Metals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a purchase or sale of metals."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Metals = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Metals";
			definition = "Transaction is a purchase or sale of metals.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "MET";
		}
	};
	/**
	 * Transaction is a payment of a pension allowance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of a pension allowance."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode PensionPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PensionPayment";
			definition = "Transaction is a payment of a pension allowance.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "PEN";
		}
	};
	/**
	 * Transaction is a payment for the purchase and sale of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseSaleOfGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment for the purchase and sale of goods."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode PurchaseSaleOfGoods = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseSaleOfGoods";
			definition = "Transaction is a payment for the purchase and sale of goods.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "GDS";
		}
	};
	/**
	 * Transaction is a repayment of funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a repayment of funds."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Refund = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Refund";
			definition = "Transaction is a repayment of funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "REF";
		}
	};
	/**
	 * Transaction is a payment of rent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of rent."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Rent = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rent";
			definition = "Transaction is a payment of rent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "REN";
		}
	};
	/**
	 * Transaction is a payment of royalties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ROY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Royalties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of royalties."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Royalties = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Royalties";
			definition = "Transaction is a payment of royalties.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "ROY";
		}
	};
	/**
	 * Transaction is a payment for the purchase and sale of services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseSaleOfServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment for the purchase and sale of services."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode PurchaseSaleOfServices = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseSaleOfServices";
			definition = "Transaction is a payment for the purchase and sale of services.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "SCV";
		}
	};
	/**
	 * Transaction is a payment of salaries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of salaries."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode SalaryPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SalaryPayment";
			definition = "Transaction is a payment of salaries.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "SAL";
		}
	};
	/**
	 * Transaction is a social security benefit, a payment made by a government
	 * to support individuals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a social security benefit, a payment made by a government to support individuals."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode SocialSecurityBenefit = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityBenefit";
			definition = "Transaction is a social security benefit, a payment made by a government to support individuals.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "SSB";
		}
	};
	/**
	 * Transaction is a standing order. A standing order is an instruction given
	 * by a party having explicit authority on the account to debit, ie, either
	 * debit account owner or originating party, to a first agent to process
	 * cash transfers at specified intervals during an implicit or explicit
	 * period of time. It is given once, and is valid for an open or closed
	 * period of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a standing order.  A standing order is an instruction given by a party having explicit authority on the account to debit, ie, either debit account owner or originating party, to a first agent to process cash transfers at specified intervals during an implicit or explicit period of time. It is given once, and is valid for an open or closed period of time."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode StandingOrder = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StandingOrder";
			definition = "Transaction is a standing order.  A standing order is an instruction given by a party having explicit authority on the account to debit, ie, either debit account owner or originating party, to a first agent to process cash transfers at specified intervals during an implicit or explicit period of time. It is given once, and is valid for an open or closed period of time.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "STO";
		}
	};
	/**
	 * Transaction is a payment of a subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of a subscription."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Subscription = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "Transaction is a payment of a subscription.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "SBS";
		}
	};
	/**
	 * Payment is linked to the Treasury State.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryStatePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment is linked to the Treasury State."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode TreasuryStatePayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasuryStatePayment";
			definition = "Payment is linked to the Treasury State.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "TRP";
		}
	};
	/**
	 * Transaction is a payment made to an unemployed/disabled person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnemploymentDisabilityBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment made to an unemployed/disabled person."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode UnemploymentDisabilityBenefit = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnemploymentDisabilityBenefit";
			definition = "Transaction is a payment made to an unemployed/disabled person.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "BEN";
		}
	};
	/**
	 * Transaction is apayment of value added tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is apayment of value added tax."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode ValueAddedTaxPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTaxPayment";
			definition = "Transaction is apayment of value added tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "VAT";
		}
	};
	/**
	 * Transaction is a payment of withholding tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WHT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithHoldingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of withholding tax."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode WithHoldingTax = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithHoldingTax";
			definition = "Transaction is a payment of withholding tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "WHT";
		}
	};
	/**
	 * Transaction is a payment of taxes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of taxes."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode TaxPayment = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxPayment";
			definition = "Transaction is a payment of taxes.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "TAX";
		}
	};
	/**
	 * Transaction is for an unspecified reason. Miscellaneous is to be used
	 * only when no explicit code is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Miscellaneous"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is for an unspecified reason. Miscellaneous is to be used only when no explicit code is available."
	 * </li>
	 * </ul>
	 */
	public static final PaymentTypeCode Miscellaneous = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Miscellaneous";
			definition = "Transaction is for an unspecified reason. Miscellaneous is to be used only when no explicit code is available.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "MSC";
		}
	};
	/**
	 * Transaction is linked to an overnight deposit
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OvernightDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is linked to an overnight deposit"</li>
	 * </ul>
	 */
	public static final PaymentTypeCode OvernightDeposit = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OvernightDeposit";
			definition = "Transaction is linked to an overnight deposit";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "OND";
		}
	};
	/**
	 * Transaction is linked to the marginal lending facility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginalLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is linked to the marginal lending facility."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode MarginalLending = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginalLending";
			definition = "Transaction is linked to the marginal lending facility.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "MGL";
		}
	};
	/**
	 * Specifies that a proprietary code must be indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
	 * PaymentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies that a proprietary code must be indicated."</li>
	 * </ul>
	 */
	public static final PaymentTypeCode Other = new PaymentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Specifies that a proprietary code must be indicated.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, PaymentTypeCode> codesByName = new LinkedHashMap<>();

	protected PaymentTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CSH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTypeCode";
				definition = "Specifies the type, or nature, of the payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentTypeCode.CashTransaction, com.tools20022.repository.codeset.PaymentTypeCode.DomesticPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.DomesticHighValuePayment, com.tools20022.repository.codeset.PaymentTypeCode.DomesticPriorityPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.CrossBorderPayment, com.tools20022.repository.codeset.PaymentTypeCode.CrossBorderPriorityPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.CrossBorderHighValuePayment, com.tools20022.repository.codeset.PaymentTypeCode.ThirdCurrencyPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.ThirdCurrencyHighValuePayment, com.tools20022.repository.codeset.PaymentTypeCode.ThirdCurrencyPriorityPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.TradeSettlementPayment, com.tools20022.repository.codeset.PaymentTypeCode.ForeignExchange, com.tools20022.repository.codeset.PaymentTypeCode.EquivalentAmount,
						com.tools20022.repository.codeset.PaymentTypeCode.Loan, com.tools20022.repository.codeset.PaymentTypeCode.LoanRepayment, com.tools20022.repository.codeset.PaymentTypeCode.Securities,
						com.tools20022.repository.codeset.PaymentTypeCode.LockBox, com.tools20022.repository.codeset.PaymentTypeCode.Dividend, com.tools20022.repository.codeset.PaymentTypeCode.CrossedCheque,
						com.tools20022.repository.codeset.PaymentTypeCode.OpenCheque, com.tools20022.repository.codeset.PaymentTypeCode.OrderCheque, com.tools20022.repository.codeset.PaymentTypeCode.CircularCheque,
						com.tools20022.repository.codeset.PaymentTypeCode.TravellersCheques, com.tools20022.repository.codeset.PaymentTypeCode.BankDraft, com.tools20022.repository.codeset.PaymentTypeCode.CashLetter,
						com.tools20022.repository.codeset.PaymentTypeCode.DocumentaryCredit, com.tools20022.repository.codeset.PaymentTypeCode.BillOfExchange, com.tools20022.repository.codeset.PaymentTypeCode.Collection,
						com.tools20022.repository.codeset.PaymentTypeCode.CashManagementTransfer, com.tools20022.repository.codeset.PaymentTypeCode.SweepAccount, com.tools20022.repository.codeset.PaymentTypeCode.TopAccount,
						com.tools20022.repository.codeset.PaymentTypeCode.ZeroBalanceAccount, com.tools20022.repository.codeset.PaymentTypeCode.StandingFacilities,
						com.tools20022.repository.codeset.PaymentTypeCode.SwiftPayServiceLevelCredit, com.tools20022.repository.codeset.PaymentTypeCode.PriorityServiceLevelCredit,
						com.tools20022.repository.codeset.PaymentTypeCode.StandardServiceLevelCredit, com.tools20022.repository.codeset.PaymentTypeCode.LiquidityTransfer, com.tools20022.repository.codeset.PaymentTypeCode.AdvancePayment,
						com.tools20022.repository.codeset.PaymentTypeCode.ValueDateAdjustment, com.tools20022.repository.codeset.PaymentTypeCode.DVPGross, com.tools20022.repository.codeset.PaymentTypeCode.DVPNet,
						com.tools20022.repository.codeset.PaymentTypeCode.Netting, com.tools20022.repository.codeset.PaymentTypeCode.LimitPayment, com.tools20022.repository.codeset.PaymentTypeCode.BackUp,
						com.tools20022.repository.codeset.PaymentTypeCode.ExpressPayment, com.tools20022.repository.codeset.PaymentTypeCode.CentralBankOperation, com.tools20022.repository.codeset.PaymentTypeCode.CLSPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.EuroDomesticPayment, com.tools20022.repository.codeset.PaymentTypeCode.AgriculturalTransfer, com.tools20022.repository.codeset.PaymentTypeCode.AlimonyPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.BalanceRetail, com.tools20022.repository.codeset.PaymentTypeCode.BonusPayment, com.tools20022.repository.codeset.PaymentTypeCode.BrokerageFee,
						com.tools20022.repository.codeset.PaymentTypeCode.CapitalBuilding, com.tools20022.repository.codeset.PaymentTypeCode.CharityPayment, com.tools20022.repository.codeset.PaymentTypeCode.ChildBenefit,
						com.tools20022.repository.codeset.PaymentTypeCode.CommercialCredit, com.tools20022.repository.codeset.PaymentTypeCode.Commission, com.tools20022.repository.codeset.PaymentTypeCode.CommodityTransfer,
						com.tools20022.repository.codeset.PaymentTypeCode.Costs, com.tools20022.repository.codeset.PaymentTypeCode.Copyright, com.tools20022.repository.codeset.PaymentTypeCode.GovernmentPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.InstalmentHirePurchaseAgreement, com.tools20022.repository.codeset.PaymentTypeCode.InsurancePremium,
						com.tools20022.repository.codeset.PaymentTypeCode.IntraCompanyPayment, com.tools20022.repository.codeset.PaymentTypeCode.Interest, com.tools20022.repository.codeset.PaymentTypeCode.LicenseFee,
						com.tools20022.repository.codeset.PaymentTypeCode.Metals, com.tools20022.repository.codeset.PaymentTypeCode.PensionPayment, com.tools20022.repository.codeset.PaymentTypeCode.PurchaseSaleOfGoods,
						com.tools20022.repository.codeset.PaymentTypeCode.Refund, com.tools20022.repository.codeset.PaymentTypeCode.Rent, com.tools20022.repository.codeset.PaymentTypeCode.Royalties,
						com.tools20022.repository.codeset.PaymentTypeCode.PurchaseSaleOfServices, com.tools20022.repository.codeset.PaymentTypeCode.SalaryPayment, com.tools20022.repository.codeset.PaymentTypeCode.SocialSecurityBenefit,
						com.tools20022.repository.codeset.PaymentTypeCode.StandingOrder, com.tools20022.repository.codeset.PaymentTypeCode.Subscription, com.tools20022.repository.codeset.PaymentTypeCode.TreasuryStatePayment,
						com.tools20022.repository.codeset.PaymentTypeCode.UnemploymentDisabilityBenefit, com.tools20022.repository.codeset.PaymentTypeCode.ValueAddedTaxPayment,
						com.tools20022.repository.codeset.PaymentTypeCode.WithHoldingTax, com.tools20022.repository.codeset.PaymentTypeCode.TaxPayment, com.tools20022.repository.codeset.PaymentTypeCode.Miscellaneous,
						com.tools20022.repository.codeset.PaymentTypeCode.OvernightDeposit, com.tools20022.repository.codeset.PaymentTypeCode.MarginalLending, com.tools20022.repository.codeset.PaymentTypeCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashTransaction.getCodeName().get(), CashTransaction);
		codesByName.put(DomesticPayment.getCodeName().get(), DomesticPayment);
		codesByName.put(DomesticHighValuePayment.getCodeName().get(), DomesticHighValuePayment);
		codesByName.put(DomesticPriorityPayment.getCodeName().get(), DomesticPriorityPayment);
		codesByName.put(CrossBorderPayment.getCodeName().get(), CrossBorderPayment);
		codesByName.put(CrossBorderPriorityPayment.getCodeName().get(), CrossBorderPriorityPayment);
		codesByName.put(CrossBorderHighValuePayment.getCodeName().get(), CrossBorderHighValuePayment);
		codesByName.put(ThirdCurrencyPayment.getCodeName().get(), ThirdCurrencyPayment);
		codesByName.put(ThirdCurrencyHighValuePayment.getCodeName().get(), ThirdCurrencyHighValuePayment);
		codesByName.put(ThirdCurrencyPriorityPayment.getCodeName().get(), ThirdCurrencyPriorityPayment);
		codesByName.put(TradeSettlementPayment.getCodeName().get(), TradeSettlementPayment);
		codesByName.put(ForeignExchange.getCodeName().get(), ForeignExchange);
		codesByName.put(EquivalentAmount.getCodeName().get(), EquivalentAmount);
		codesByName.put(Loan.getCodeName().get(), Loan);
		codesByName.put(LoanRepayment.getCodeName().get(), LoanRepayment);
		codesByName.put(Securities.getCodeName().get(), Securities);
		codesByName.put(LockBox.getCodeName().get(), LockBox);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(CrossedCheque.getCodeName().get(), CrossedCheque);
		codesByName.put(OpenCheque.getCodeName().get(), OpenCheque);
		codesByName.put(OrderCheque.getCodeName().get(), OrderCheque);
		codesByName.put(CircularCheque.getCodeName().get(), CircularCheque);
		codesByName.put(TravellersCheques.getCodeName().get(), TravellersCheques);
		codesByName.put(BankDraft.getCodeName().get(), BankDraft);
		codesByName.put(CashLetter.getCodeName().get(), CashLetter);
		codesByName.put(DocumentaryCredit.getCodeName().get(), DocumentaryCredit);
		codesByName.put(BillOfExchange.getCodeName().get(), BillOfExchange);
		codesByName.put(Collection.getCodeName().get(), Collection);
		codesByName.put(CashManagementTransfer.getCodeName().get(), CashManagementTransfer);
		codesByName.put(SweepAccount.getCodeName().get(), SweepAccount);
		codesByName.put(TopAccount.getCodeName().get(), TopAccount);
		codesByName.put(ZeroBalanceAccount.getCodeName().get(), ZeroBalanceAccount);
		codesByName.put(StandingFacilities.getCodeName().get(), StandingFacilities);
		codesByName.put(SwiftPayServiceLevelCredit.getCodeName().get(), SwiftPayServiceLevelCredit);
		codesByName.put(PriorityServiceLevelCredit.getCodeName().get(), PriorityServiceLevelCredit);
		codesByName.put(StandardServiceLevelCredit.getCodeName().get(), StandardServiceLevelCredit);
		codesByName.put(LiquidityTransfer.getCodeName().get(), LiquidityTransfer);
		codesByName.put(AdvancePayment.getCodeName().get(), AdvancePayment);
		codesByName.put(ValueDateAdjustment.getCodeName().get(), ValueDateAdjustment);
		codesByName.put(DVPGross.getCodeName().get(), DVPGross);
		codesByName.put(DVPNet.getCodeName().get(), DVPNet);
		codesByName.put(Netting.getCodeName().get(), Netting);
		codesByName.put(LimitPayment.getCodeName().get(), LimitPayment);
		codesByName.put(BackUp.getCodeName().get(), BackUp);
		codesByName.put(ExpressPayment.getCodeName().get(), ExpressPayment);
		codesByName.put(CentralBankOperation.getCodeName().get(), CentralBankOperation);
		codesByName.put(CLSPayment.getCodeName().get(), CLSPayment);
		codesByName.put(EuroDomesticPayment.getCodeName().get(), EuroDomesticPayment);
		codesByName.put(AgriculturalTransfer.getCodeName().get(), AgriculturalTransfer);
		codesByName.put(AlimonyPayment.getCodeName().get(), AlimonyPayment);
		codesByName.put(BalanceRetail.getCodeName().get(), BalanceRetail);
		codesByName.put(BonusPayment.getCodeName().get(), BonusPayment);
		codesByName.put(BrokerageFee.getCodeName().get(), BrokerageFee);
		codesByName.put(CapitalBuilding.getCodeName().get(), CapitalBuilding);
		codesByName.put(CharityPayment.getCodeName().get(), CharityPayment);
		codesByName.put(ChildBenefit.getCodeName().get(), ChildBenefit);
		codesByName.put(CommercialCredit.getCodeName().get(), CommercialCredit);
		codesByName.put(Commission.getCodeName().get(), Commission);
		codesByName.put(CommodityTransfer.getCodeName().get(), CommodityTransfer);
		codesByName.put(Costs.getCodeName().get(), Costs);
		codesByName.put(Copyright.getCodeName().get(), Copyright);
		codesByName.put(GovernmentPayment.getCodeName().get(), GovernmentPayment);
		codesByName.put(InstalmentHirePurchaseAgreement.getCodeName().get(), InstalmentHirePurchaseAgreement);
		codesByName.put(InsurancePremium.getCodeName().get(), InsurancePremium);
		codesByName.put(IntraCompanyPayment.getCodeName().get(), IntraCompanyPayment);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(LicenseFee.getCodeName().get(), LicenseFee);
		codesByName.put(Metals.getCodeName().get(), Metals);
		codesByName.put(PensionPayment.getCodeName().get(), PensionPayment);
		codesByName.put(PurchaseSaleOfGoods.getCodeName().get(), PurchaseSaleOfGoods);
		codesByName.put(Refund.getCodeName().get(), Refund);
		codesByName.put(Rent.getCodeName().get(), Rent);
		codesByName.put(Royalties.getCodeName().get(), Royalties);
		codesByName.put(PurchaseSaleOfServices.getCodeName().get(), PurchaseSaleOfServices);
		codesByName.put(SalaryPayment.getCodeName().get(), SalaryPayment);
		codesByName.put(SocialSecurityBenefit.getCodeName().get(), SocialSecurityBenefit);
		codesByName.put(StandingOrder.getCodeName().get(), StandingOrder);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(TreasuryStatePayment.getCodeName().get(), TreasuryStatePayment);
		codesByName.put(UnemploymentDisabilityBenefit.getCodeName().get(), UnemploymentDisabilityBenefit);
		codesByName.put(ValueAddedTaxPayment.getCodeName().get(), ValueAddedTaxPayment);
		codesByName.put(WithHoldingTax.getCodeName().get(), WithHoldingTax);
		codesByName.put(TaxPayment.getCodeName().get(), TaxPayment);
		codesByName.put(Miscellaneous.getCodeName().get(), Miscellaneous);
		codesByName.put(OvernightDeposit.getCodeName().get(), OvernightDeposit);
		codesByName.put(MarginalLending.getCodeName().get(), MarginalLending);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static PaymentTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentTypeCode[] values() {
		PaymentTypeCode[] values = new PaymentTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentTypeCode> {
		@Override
		public PaymentTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}