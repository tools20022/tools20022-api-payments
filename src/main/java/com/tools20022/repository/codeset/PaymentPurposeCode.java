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
import com.tools20022.repository.codeset.PaymentPurposeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of transaction that resulted in a payment initiation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#SalaryPayment
 * PaymentPurposeCode.SalaryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#TreasuryPayment
 * PaymentPurposeCode.TreasuryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#AdvancePayment
 * PaymentPurposeCode.AdvancePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#AgriculturalTransfer
 * PaymentPurposeCode.AgriculturalTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#AlimonyPayment
 * PaymentPurposeCode.AlimonyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#ChildBenefit
 * PaymentPurposeCode.ChildBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#UnemploymentDisabilityBenefit
 * PaymentPurposeCode.UnemploymentDisabilityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#BonusPayment
 * PaymentPurposeCode.BonusPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#CashManagementTransfer
 * PaymentPurposeCode.CashManagementTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#CapitalBuilding
 * PaymentPurposeCode.CapitalBuilding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#CharityPayment
 * PaymentPurposeCode.CharityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#CollectionPayment
 * PaymentPurposeCode.CollectionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#CommodityTransfer
 * PaymentPurposeCode.CommodityTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#CommercialPayment
 * PaymentPurposeCode.CommercialPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Commission
 * PaymentPurposeCode.Commission}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Costs
 * PaymentPurposeCode.Costs}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Copyright
 * PaymentPurposeCode.Copyright}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Dividend
 * PaymentPurposeCode.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#ForeignExchange
 * PaymentPurposeCode.ForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#PurchaseSaleOfGoods
 * PaymentPurposeCode.PurchaseSaleOfGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#GovernmentPayment
 * PaymentPurposeCode.GovernmentPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#InstalmentHirePurchaseAgreement
 * PaymentPurposeCode.InstalmentHirePurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#IntraCompanyPayment
 * PaymentPurposeCode.IntraCompanyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#InsurancePremium
 * PaymentPurposeCode.InsurancePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Interest
 * PaymentPurposeCode.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#LicenseFee
 * PaymentPurposeCode.LicenseFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Loan
 * PaymentPurposeCode.Loan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#LoanRepayment
 * PaymentPurposeCode.LoanRepayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Netting
 * PaymentPurposeCode.Netting}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Payroll
 * PaymentPurposeCode.Payroll}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#PensionPayment
 * PaymentPurposeCode.PensionPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Refund
 * PaymentPurposeCode.Refund}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Rent
 * PaymentPurposeCode.Rent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Royalties
 * PaymentPurposeCode.Royalties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#PurchaseSaleOfServices
 * PaymentPurposeCode.PurchaseSaleOfServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Securities
 * PaymentPurposeCode.Securities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#SocialSecurityBenefit
 * PaymentPurposeCode.SocialSecurityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Subscription
 * PaymentPurposeCode.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#TaxPayment
 * PaymentPurposeCode.TaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#ValueAddedTaxPayment
 * PaymentPurposeCode.ValueAddedTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#ConsumerThirdPartyConsolidatedPayment
 * PaymentPurposeCode.ConsumerThirdPartyConsolidatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#DebitCollectionPayment
 * PaymentPurposeCode.DebitCollectionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#SupplierPayment
 * PaymentPurposeCode.SupplierPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Hedging
 * PaymentPurposeCode.Hedging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#MultipleServiceTypes
 * PaymentPurposeCode.MultipleServiceTypes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#NotOtherwiseSpecified
 * PaymentPurposeCode.NotOtherwiseSpecified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#CardPayment
 * PaymentPurposeCode.CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#CreditCardBill
 * PaymentPurposeCode.CreditCardBill}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Ferry
 * PaymentPurposeCode.Ferry}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Air
 * PaymentPurposeCode.Air}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Bus
 * PaymentPurposeCode.Bus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Railway
 * PaymentPurposeCode.Railway}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#ConvalescentCareFacility
 * PaymentPurposeCode.ConvalescentCareFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#DentalServices
 * PaymentPurposeCode.DentalServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#AnesthesiaServices
 * PaymentPurposeCode.AnesthesiaServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#HomeHealthCare
 * PaymentPurposeCode.HomeHealthCare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#HospitalCare
 * PaymentPurposeCode.HospitalCare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#IntermediateCareFacility
 * PaymentPurposeCode.IntermediateCareFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#LongTermCareFacility
 * PaymentPurposeCode.LongTermCareFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#MedicalServices
 * PaymentPurposeCode.MedicalServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#VisionCare
 * PaymentPurposeCode.VisionCare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#DurableMedicaleEquipment
 * PaymentPurposeCode.DurableMedicaleEquipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#CableTVBill
 * PaymentPurposeCode.CableTVBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#ElectricityBill
 * PaymentPurposeCode.ElectricityBill}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#GasBill
 * PaymentPurposeCode.GasBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#TelephoneBill
 * PaymentPurposeCode.TelephoneBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#OtherTelecomRelatedBill
 * PaymentPurposeCode.OtherTelecomRelatedBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#WaterBill
 * PaymentPurposeCode.WaterBill}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Study
 * PaymentPurposeCode.Study}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#PricePayment
 * PaymentPurposeCode.PricePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Installment
 * PaymentPurposeCode.Installment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#RecurringInstallmentPayment
 * PaymentPurposeCode.RecurringInstallmentPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#OpeningFee
 * PaymentPurposeCode.OpeningFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#CancellationFee
 * PaymentPurposeCode.CancellationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#GovernmentInsurance
 * PaymentPurposeCode.GovernmentInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#InsurancePremiumCar
 * PaymentPurposeCode.InsurancePremiumCar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#LaborInsurance
 * PaymentPurposeCode.LaborInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#LifeInsurance
 * PaymentPurposeCode.LifeInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#PropertyInsurance
 * PaymentPurposeCode.PropertyInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#HealthInsurance
 * PaymentPurposeCode.HealthInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#CarLoanPrincipalRepayment
 * PaymentPurposeCode.CarLoanPrincipalRepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#HousingLoanRepayment
 * PaymentPurposeCode.HousingLoanRepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#CompanySocialLoanPaymentToBank
 * PaymentPurposeCode.CompanySocialLoanPaymentToBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#EstateTax
 * PaymentPurposeCode.EstateTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#HousingTax
 * PaymentPurposeCode.HousingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#IncomeTax
 * PaymentPurposeCode.IncomeTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#NetIncomeTax
 * PaymentPurposeCode.NetIncomeTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#BusinessExpenses
 * PaymentPurposeCode.BusinessExpenses}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#TrustFund
 * PaymentPurposeCode.TrustFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#NetworkCharge
 * PaymentPurposeCode.NetworkCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#NetworkCommunication
 * PaymentPurposeCode.NetworkCommunication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#ReceiptPayment
 * PaymentPurposeCode.ReceiptPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#PaymentTerms
 * PaymentPurposeCode.PaymentTerms}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#Other
 * PaymentPurposeCode.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#WithHolding
 * PaymentPurposeCode.WithHolding}</li>
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
 * <li>"SALA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentPurposeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of transaction that resulted in a payment initiation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentPurposeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction is the payment of salaries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SALA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of salaries."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode SalaryPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SalaryPayment";
			definition = "Transaction is the payment of salaries.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "SALA";
		}
	};
	/**
	 * Transaction is related to treasury operations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to treasury operations."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode TreasuryPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasuryPayment";
			definition = "Transaction is related to treasury operations.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "TREA";
		}
	};
	/**
	 * Transaction is an advance payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADVA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvancePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is an advance payment."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode AdvancePayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdvancePayment";
			definition = "Transaction is an advance payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "ADVA";
		}
	};
	/**
	 * Transaction is related to the agricultural domain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGRT"</li>
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
	public static final PaymentPurposeCode AgriculturalTransfer = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgriculturalTransfer";
			definition = "Transaction is related to the agricultural domain.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "AGRT";
		}
	};
	/**
	 * Transaction is the payment of alimony.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALMY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlimonyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of alimony."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode AlimonyPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlimonyPayment";
			definition = "Transaction is the payment of alimony.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "ALMY";
		}
	};
	/**
	 * Transaction is related to a payment made to assist parent/guardian to
	 * maintain child.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BECH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChildBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment made to assist parent/guardian to maintain child."
	 * </li>
	 * </ul>
	 */
	public static final PaymentPurposeCode ChildBenefit = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChildBenefit";
			definition = "Transaction is related to a payment made to assist parent/guardian to maintain child.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "BECH";
		}
	};
	/**
	 * Transaction is related to a payment to a person who is
	 * unemployed/disabled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BENE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnemploymentDisabilityBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment to a person who is unemployed/disabled."
	 * </li>
	 * </ul>
	 */
	public static final PaymentPurposeCode UnemploymentDisabilityBenefit = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnemploymentDisabilityBenefit";
			definition = "Transaction is related to a payment to a person who is unemployed/disabled.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "BENE";
		}
	};
	/**
	 * Transaction is related to payment of a bonus.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BONU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to payment of a bonus."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode BonusPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BonusPayment";
			definition = "Transaction is related to payment of a bonus.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "BONU";
		}
	};
	/**
	 * Transaction is a general cash management instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
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
	public static final PaymentPurposeCode CashManagementTransfer = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashManagementTransfer";
			definition = "Transaction is a general cash management instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Transaction is related to capital building fringe fortune, ie capital
	 * building for retirement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalBuilding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to capital building fringe fortune, ie capital building for retirement."
	 * </li>
	 * </ul>
	 */
	public static final PaymentPurposeCode CapitalBuilding = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalBuilding";
			definition = "Transaction is related to capital building fringe fortune, ie capital building for retirement.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "CBFF";
		}
	};
	/**
	 * Transaction is a payment for charity reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAR"</li>
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
	public static final PaymentPurposeCode CharityPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CharityPayment";
			definition = "Transaction is a payment for charity reasons.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Transaction is a collection of funds initiated via a credit transfer or
	 * direct debit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a collection of funds initiated via a credit transfer or direct debit."
	 * </li>
	 * </ul>
	 */
	public static final PaymentPurposeCode CollectionPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionPayment";
			definition = "Transaction is a collection of funds initiated via a credit transfer or direct debit.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "COLL";
		}
	};
	/**
	 * Transaction is payment of commodities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommodityTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of commodities."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode CommodityTransfer = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommodityTransfer";
			definition = "Transaction is payment of commodities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "CMDT";
		}
	};
	/**
	 * Transaction is related to a payment of commercial credit or debit.
	 * (formerly CommercialCredit).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment of commercial credit or debit. (formerly CommercialCredit)."
	 * </li>
	 * </ul>
	 */
	public static final PaymentPurposeCode CommercialPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialPayment";
			definition = "Transaction is related to a payment of commercial credit or debit. (formerly CommercialCredit).";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "COMC";
		}
	};
	/**
	 * Transaction is payment of commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of commission."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Commission = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Transaction is payment of commission.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Transaction is related to payment of costs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Costs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to payment of costs."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Costs = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Costs";
			definition = "Transaction is related to payment of costs.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "COST";
		}
	};
	/**
	 * Transaction is payment of copyright.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPYR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copyright"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of copyright."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Copyright = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Copyright";
			definition = "Transaction is payment of copyright.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "CPYR";
		}
	};
	/**
	 * Transaction is payment of dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of dividends."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Dividend = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Transaction is payment of dividends.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Transaction is related to a foreign exchange operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FREX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a foreign exchange operation."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode ForeignExchange = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchange";
			definition = "Transaction is related to a foreign exchange operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "FREX";
		}
	};
	/**
	 * Transaction is related to purchase and sale of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GDDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseSaleOfGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to purchase and sale of goods."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode PurchaseSaleOfGoods = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseSaleOfGoods";
			definition = "Transaction is related to purchase and sale of goods.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "GDDS";
		}
	};
	/**
	 * Transaction is a payment to or from a government department.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GOVT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment to or from a government department."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode GovernmentPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GovernmentPayment";
			definition = "Transaction is a payment to or from a government department.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "GOVT";
		}
	};
	/**
	 * Transaction is payment for an installment/hire-purchase agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IHRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentHirePurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is payment for an installment/hire-purchase agreement."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode InstalmentHirePurchaseAgreement = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstalmentHirePurchaseAgreement";
			definition = "Transaction is payment for an installment/hire-purchase agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "IHRP";
		}
	};
	/**
	 * Transaction is an intra-company payment, ie, a payment between two
	 * companies belonging to the same group.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTC"</li>
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
	public static final PaymentPurposeCode IntraCompanyPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntraCompanyPayment";
			definition = "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "INTC";
		}
	};
	/**
	 * Transaction is payment of an insurance premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePremium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of an insurance premium."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode InsurancePremium = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsurancePremium";
			definition = "Transaction is payment of an insurance premium.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "INSU";
		}
	};
	/**
	 * Transaction is payment of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of interest."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Interest = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Transaction is payment of interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Transaction is payment of a license fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LICF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LicenseFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is payment of a license fee."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode LicenseFee = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LicenseFee";
			definition = "Transaction is payment of a license fee.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "LICF";
		}
	};
	/**
	 * Transaction is related to transfer of loan to borrower.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to transfer of loan to borrower."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Loan = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Loan";
			definition = "Transaction is related to transfer of loan to borrower.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Transaction is related to repayment of loan to lender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoanRepayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to repayment of loan to lender."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode LoanRepayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LoanRepayment";
			definition = "Transaction is related to repayment of loan to lender.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "LOAR";
		}
	};
	/**
	 * Transaction is related to a netting operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a netting operation."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Netting = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Transaction is related to a netting operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * Transaction is related to the payment of payroll.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAYR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payroll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to the payment of payroll."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Payroll = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payroll";
			definition = "Transaction is related to the payment of payroll.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "PAYR";
		}
	};
	/**
	 * Transaction is the payment of pension.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of pension."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode PensionPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PensionPayment";
			definition = "Transaction is the payment of pension.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "PENS";
		}
	};
	/**
	 * Transaction is the payment of a refund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of a refund."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Refund = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Refund";
			definition = "Transaction is the payment of a refund.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "REFU";
		}
	};
	/**
	 * Transaction is the payment of rent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RENT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of rent."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Rent = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rent";
			definition = "Transaction is the payment of rent.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "RENT";
		}
	};
	/**
	 * Transaction is the payment of royalties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ROYA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Royalties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of royalties."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Royalties = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Royalties";
			definition = "Transaction is the payment of royalties.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "ROYA";
		}
	};
	/**
	 * Transaction is related to purchase and sale of services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseSaleOfServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to purchase and sale of services."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode PurchaseSaleOfServices = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseSaleOfServices";
			definition = "Transaction is related to purchase and sale of services.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "SCVE";
		}
	};
	/**
	 * Transaction is the payment of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of securities."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Securities = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Securities";
			definition = "Transaction is the payment of securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Transaction is a social security benefit, ie payment made by a government
	 * to support individuals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityBenefit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a social security benefit, ie payment made by a government to support individuals."
	 * </li>
	 * </ul>
	 */
	public static final PaymentPurposeCode SocialSecurityBenefit = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityBenefit";
			definition = "Transaction is a social security benefit, ie payment made by a government to support individuals.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "SSBE";
		}
	};
	/**
	 * Transaction is related to a payment of information or entertainment
	 * services either in printed or electronic form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment of information or entertainment services either in printed or electronic form."
	 * </li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Subscription = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "Transaction is related to a payment of information or entertainment services either in printed or electronic form.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Transaction is the payment of taxes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of taxes."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode TaxPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxPayment";
			definition = "Transaction is the payment of taxes.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "TAXS";
		}
	};
	/**
	 * Transaction is the payment of value added tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VATX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is the payment of value added tax."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode ValueAddedTaxPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTaxPayment";
			definition = "Transaction is the payment of value added tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "VATX";
		}
	};
	/**
	 * Transaction is a payment used by a third party who can collect funds to
	 * pay on behalf of consumers, ie credit counseling or bill payment
	 * companies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumerThirdPartyConsolidatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment used by a third party who can collect funds to pay on behalf of consumers, ie credit counseling or bill payment companies."
	 * </li>
	 * </ul>
	 */
	public static final PaymentPurposeCode ConsumerThirdPartyConsolidatedPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsumerThirdPartyConsolidatedPayment";
			definition = "Transaction is a payment used by a third party who can collect funds to pay on behalf of consumers, ie credit counseling or bill payment companies.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "COMT";
		}
	};
	/**
	 * Collection of funds initiated via a debit transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCollectionPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collection of funds initiated via a debit transfer."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode DebitCollectionPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitCollectionPayment";
			definition = "Collection of funds initiated via a debit transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "DBTC";
		}
	};
	/**
	 * Transaction is related to a payment to a supplier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplierPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment to a supplier."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode SupplierPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SupplierPayment";
			definition = "Transaction is related to a payment to a supplier.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "SUPP";
		}
	};
	/**
	 * Transaction is related to a hedging operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HEDG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hedging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a hedging operation."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Hedging = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Hedging";
			definition = "Transaction is related to a hedging operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "HEDG";
		}
	};
	/**
	 * Transaction is related to a payment for multiple service types.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSVC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleServiceTypes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment for multiple service types."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode MultipleServiceTypes = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultipleServiceTypes";
			definition = "Transaction is related to a payment for multiple service types.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "MSVC";
		}
	};
	/**
	 * Transaction is related to a payment for type of services not specified
	 * elsewhere.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOWS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotOtherwiseSpecified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment for type of services not specified elsewhere."
	 * </li>
	 * </ul>
	 */
	public static final PaymentPurposeCode NotOtherwiseSpecified = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotOtherwiseSpecified";
			definition = "Transaction is related to a payment for type of services not specified elsewhere.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "NOWS";
		}
	};
	/**
	 * Transaction is related to a payment of credit card account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CARD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment of credit card account."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode CardPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Transaction is related to a payment of credit card account.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "CARD";
		}
	};
	/**
	 * Transaction is related to a payment of credit card bill.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditCardBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of credit card bill."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode CreditCardBill = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditCardBill";
			definition = "Transaction is related to a payment of credit card bill.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "CDBL";
		}
	};
	/**
	 * Transaction is a payment for ferry related business.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FERB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ferry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment for ferry related business."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Ferry = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ferry";
			definition = "Transaction is a payment for ferry related business.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "FERB";
		}
	};
	/**
	 * Transaction is a payment for air transport related business.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AIRB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Air"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment for air transport related business."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Air = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Air";
			definition = "Transaction is a payment for air transport related business.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "AIRB";
		}
	};
	/**
	 * Transaction is a payment for bus transport related business.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUSB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment for bus transport related business."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Bus = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bus";
			definition = "Transaction is a payment for bus transport related business.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "BUSB";
		}
	};
	/**
	 * Transaction is a payment for railway transport related business.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RLWY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Railway"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment for railway transport related business."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Railway = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Railway";
			definition = "Transaction is a payment for railway transport related business.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "RLWY";
		}
	};
	/**
	 * Transaction is a payment for convalescence care facility services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CVCF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvalescentCareFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment for convalescence care facility services."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode ConvalescentCareFacility = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConvalescentCareFacility";
			definition = "Transaction is a payment for convalescence care facility services.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "CVCF";
		}
	};
	/**
	 * Transaction is a payment for dental services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DNTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DentalServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment for dental services."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode DentalServices = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DentalServices";
			definition = "Transaction is a payment for dental services.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "DNTS";
		}
	};
	/**
	 * Transaction is a payment for anesthesia services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnesthesiaServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment for anesthesia services."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode AnesthesiaServices = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnesthesiaServices";
			definition = "Transaction is a payment for anesthesia services.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "ANTS";
		}
	};
	/**
	 * Transaction is a payment for home health care services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HLTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HomeHealthCare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment for home health care services."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode HomeHealthCare = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HomeHealthCare";
			definition = "Transaction is a payment for home health care services.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "HLTC";
		}
	};
	/**
	 * Transaction is a payment for hospital care services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HSPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HospitalCare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment for hospital care services."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode HospitalCare = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HospitalCare";
			definition = "Transaction is a payment for hospital care services.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "HSPC";
		}
	};
	/**
	 * Transaction is a payment for intermediate care facility services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICRF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateCareFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment for intermediate care facility services."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode IntermediateCareFacility = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateCareFacility";
			definition = "Transaction is a payment for intermediate care facility services.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "ICRF";
		}
	};
	/**
	 * Transaction is a payment for long-term care facility services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTCF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCareFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment for long-term care facility services."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode LongTermCareFacility = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LongTermCareFacility";
			definition = "Transaction is a payment for long-term care facility services.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "LTCF";
		}
	};
	/**
	 * Transaction is a payment for medical care services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MDCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MedicalServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment for medical care services."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode MedicalServices = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MedicalServices";
			definition = "Transaction is a payment for medical care services.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "MDCS";
		}
	};
	/**
	 * Transaction is a payment for vision care services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VIEW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VisionCare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment for vision care services."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode VisionCare = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VisionCare";
			definition = "Transaction is a payment for vision care services.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "VIEW";
		}
	};
	/**
	 * Transaction is a payment is for use of durable medical equipment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DurableMedicaleEquipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment is for use of durable medical equipment."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode DurableMedicaleEquipment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DurableMedicaleEquipment";
			definition = "Transaction is a payment is for use of durable medical equipment.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "DMEQ";
		}
	};
	/**
	 * Transaction is related to a payment of cable TV bill.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CableTVBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of cable TV bill."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode CableTVBill = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CableTVBill";
			definition = "Transaction is related to a payment of cable TV bill.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "CBTV";
		}
	};
	/**
	 * Transaction is related to a payment of electricity bill.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectricityBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of electricity bill."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode ElectricityBill = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectricityBill";
			definition = "Transaction is related to a payment of electricity bill.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Transaction is related to a payment of gas bill.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GASB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GasBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of gas bill."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode GasBill = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GasBill";
			definition = "Transaction is related to a payment of gas bill.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "GASB";
		}
	};
	/**
	 * Transaction is related to a payment of telephone bill.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelephoneBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of telephone bill."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode TelephoneBill = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TelephoneBill";
			definition = "Transaction is related to a payment of telephone bill.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "PHON";
		}
	};
	/**
	 * Transaction is related to a payment of other telecom related bill.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTelecomRelatedBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment of other telecom related bill."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode OtherTelecomRelatedBill = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherTelecomRelatedBill";
			definition = "Transaction is related to a payment of other telecom related bill.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "OTLC";
		}
	};
	/**
	 * Transaction is related to a payment of water bill.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaterBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of water bill."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode WaterBill = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WaterBill";
			definition = "Transaction is related to a payment of water bill.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "WTER";
		}
	};
	/**
	 * Transaction is related to a payment of study/tuition costs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STDY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Study"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment of study/tuition costs."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Study = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Study";
			definition = "Transaction is related to a payment of study/tuition costs.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "STDY";
		}
	};
	/**
	 * Transaction is related to a payment of a price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricePayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of a price."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode PricePayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PricePayment";
			definition = "Transaction is related to a payment of a price.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "PRCP";
		}
	};
	/**
	 * Transaction is related to a payment of an installment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Installment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of an installment."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Installment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Installment";
			definition = "Transaction is related to a payment of an installment.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "INSM";
		}
	};
	/**
	 * Transaction is related to a payment of a recurring installment made at
	 * regular intervals.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RINP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringInstallmentPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment of a recurring installment made at regular intervals."
	 * </li>
	 * </ul>
	 */
	public static final PaymentPurposeCode RecurringInstallmentPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecurringInstallmentPayment";
			definition = "Transaction is related to a payment of a recurring installment made at regular intervals.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "RINP";
		}
	};
	/**
	 * Transaction is related to a payment of opening fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFEE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of opening fee."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode OpeningFee = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningFee";
			definition = "Transaction is related to a payment of opening fee.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "OFEE";
		}
	};
	/**
	 * Transaction is related to a payment of cancellation fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFEE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of cancellation fee."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode CancellationFee = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationFee";
			definition = "Transaction is related to a payment of cancellation fee.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "CFEE";
		}
	};
	/**
	 * Transaction is related to a payment of government insurance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GOVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentInsurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment of government insurance."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode GovernmentInsurance = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GovernmentInsurance";
			definition = "Transaction is related to a payment of government insurance.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "GOVI";
		}
	};
	/**
	 * Transaction is a payment of car insurance premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePremiumCar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of car insurance premium."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode InsurancePremiumCar = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsurancePremiumCar";
			definition = "Transaction is a payment of car insurance premium.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "INPC";
		}
	};
	/**
	 * Transaction is a payment of labor insurance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LBRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LaborInsurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of labor insurance."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode LaborInsurance = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LaborInsurance";
			definition = "Transaction is a payment of labor insurance.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "LBRI";
		}
	};
	/**
	 * Transaction is a payment of life insurance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeInsurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of life insurance."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode LifeInsurance = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LifeInsurance";
			definition = "Transaction is a payment of life insurance.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "LIFI";
		}
	};
	/**
	 * Transaction is a payment of property insurance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PropertyInsurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of property insurance."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode PropertyInsurance = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PropertyInsurance";
			definition = "Transaction is a payment of property insurance.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "PPTI";
		}
	};
	/**
	 * Transaction is a payment of health insurance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HLTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HealthInsurance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of health insurance."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode HealthInsurance = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HealthInsurance";
			definition = "Transaction is a payment of health insurance.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "HLTI";
		}
	};
	/**
	 * Transaction is a payment of car loan principal payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarLoanPrincipalRepayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a payment of car loan principal payment."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode CarLoanPrincipalRepayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CarLoanPrincipalRepayment";
			definition = "Transaction is a payment of car loan principal payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "CLPR";
		}
	};
	/**
	 * Transaction is related to a payment of housing loan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HLRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HousingLoanRepayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of housing loan."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode HousingLoanRepayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HousingLoanRepayment";
			definition = "Transaction is related to a payment of housing loan.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "HLRP";
		}
	};
	/**
	 * Transaction is a payment by a company to a bank for financing social
	 * loans to employees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSLP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanySocialLoanPaymentToBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a payment by a company to a bank for financing social loans to employees."
	 * </li>
	 * </ul>
	 */
	public static final PaymentPurposeCode CompanySocialLoanPaymentToBank = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompanySocialLoanPaymentToBank";
			definition = "Transaction is a payment by a company to a bank for financing social loans to employees.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "CSLP";
		}
	};
	/**
	 * Transaction is related to a payment of estate tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESTX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstateTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of estate tax."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode EstateTax = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstateTax";
			definition = "Transaction is related to a payment of estate tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "ESTX";
		}
	};
	/**
	 * Transaction is related to a payment of housing tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HSTX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HousingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of housing tax."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode HousingTax = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HousingTax";
			definition = "Transaction is related to a payment of housing tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "HSTX";
		}
	};
	/**
	 * Transaction is related to a payment of income tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of income tax."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode IncomeTax = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncomeTax";
			definition = "Transaction is related to a payment of income tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "INTX";
		}
	};
	/**
	 * Transaction is related to a payment of net income tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NITX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetIncomeTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of net income tax."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode NetIncomeTax = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetIncomeTax";
			definition = "Transaction is related to a payment of net income tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "NITX";
		}
	};
	/**
	 * Transaction is related to a payment of business expenses.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEXP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessExpenses"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of business expenses."
	 * </li>
	 * </ul>
	 */
	public static final PaymentPurposeCode BusinessExpenses = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BusinessExpenses";
			definition = "Transaction is related to a payment of business expenses.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "BEXP";
		}
	};
	/**
	 * Transaction is related to a payment of a trust fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrustFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of a trust fund."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode TrustFund = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TrustFund";
			definition = "Transaction is related to a payment of a trust fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "TRFD";
		}
	};
	/**
	 * Transaction is related to a payment of network charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NWCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of network charges."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode NetworkCharge = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetworkCharge";
			definition = "Transaction is related to a payment of network charges.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "NWCH";
		}
	};
	/**
	 * Transaction is related to a payment of network communication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NWCM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkCommunication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is related to a payment of network communication."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode NetworkCommunication = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetworkCommunication";
			definition = "Transaction is related to a payment of network communication.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "NWCM";
		}
	};
	/**
	 * Transaction is related to a payment of receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiptPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of receipt."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode ReceiptPayment = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceiptPayment";
			definition = "Transaction is related to a payment of receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "RCPT";
		}
	};
	/**
	 * Transaction is related to payment terms specifications.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PTSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to payment terms specifications."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode PaymentTerms = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentTerms";
			definition = "Transaction is related to payment terms specifications.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "PTSP";
		}
	};
	/**
	 * Other payment purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
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
	 * definition} = "Other payment purpose."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode Other = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Other payment purpose.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Transaction is related to a payment of withholding tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode
	 * PaymentPurposeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WHLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is related to a payment of withholding tax."</li>
	 * </ul>
	 */
	public static final PaymentPurposeCode WithHolding = new PaymentPurposeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithHolding";
			definition = "Transaction is related to a payment of withholding tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentPurposeCode.mmObject();
			codeName = "WHLD";
		}
	};
	final static private LinkedHashMap<String, PaymentPurposeCode> codesByName = new LinkedHashMap<>();

	protected PaymentPurposeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SALA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentPurposeCode";
				definition = "Specifies the type of transaction that resulted in a payment initiation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentPurposeCode.SalaryPayment, com.tools20022.repository.codeset.PaymentPurposeCode.TreasuryPayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.AdvancePayment, com.tools20022.repository.codeset.PaymentPurposeCode.AgriculturalTransfer, com.tools20022.repository.codeset.PaymentPurposeCode.AlimonyPayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.ChildBenefit, com.tools20022.repository.codeset.PaymentPurposeCode.UnemploymentDisabilityBenefit,
						com.tools20022.repository.codeset.PaymentPurposeCode.BonusPayment, com.tools20022.repository.codeset.PaymentPurposeCode.CashManagementTransfer, com.tools20022.repository.codeset.PaymentPurposeCode.CapitalBuilding,
						com.tools20022.repository.codeset.PaymentPurposeCode.CharityPayment, com.tools20022.repository.codeset.PaymentPurposeCode.CollectionPayment, com.tools20022.repository.codeset.PaymentPurposeCode.CommodityTransfer,
						com.tools20022.repository.codeset.PaymentPurposeCode.CommercialPayment, com.tools20022.repository.codeset.PaymentPurposeCode.Commission, com.tools20022.repository.codeset.PaymentPurposeCode.Costs,
						com.tools20022.repository.codeset.PaymentPurposeCode.Copyright, com.tools20022.repository.codeset.PaymentPurposeCode.Dividend, com.tools20022.repository.codeset.PaymentPurposeCode.ForeignExchange,
						com.tools20022.repository.codeset.PaymentPurposeCode.PurchaseSaleOfGoods, com.tools20022.repository.codeset.PaymentPurposeCode.GovernmentPayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.InstalmentHirePurchaseAgreement, com.tools20022.repository.codeset.PaymentPurposeCode.IntraCompanyPayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.InsurancePremium, com.tools20022.repository.codeset.PaymentPurposeCode.Interest, com.tools20022.repository.codeset.PaymentPurposeCode.LicenseFee,
						com.tools20022.repository.codeset.PaymentPurposeCode.Loan, com.tools20022.repository.codeset.PaymentPurposeCode.LoanRepayment, com.tools20022.repository.codeset.PaymentPurposeCode.Netting,
						com.tools20022.repository.codeset.PaymentPurposeCode.Payroll, com.tools20022.repository.codeset.PaymentPurposeCode.PensionPayment, com.tools20022.repository.codeset.PaymentPurposeCode.Refund,
						com.tools20022.repository.codeset.PaymentPurposeCode.Rent, com.tools20022.repository.codeset.PaymentPurposeCode.Royalties, com.tools20022.repository.codeset.PaymentPurposeCode.PurchaseSaleOfServices,
						com.tools20022.repository.codeset.PaymentPurposeCode.Securities, com.tools20022.repository.codeset.PaymentPurposeCode.SocialSecurityBenefit, com.tools20022.repository.codeset.PaymentPurposeCode.Subscription,
						com.tools20022.repository.codeset.PaymentPurposeCode.TaxPayment, com.tools20022.repository.codeset.PaymentPurposeCode.ValueAddedTaxPayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.ConsumerThirdPartyConsolidatedPayment, com.tools20022.repository.codeset.PaymentPurposeCode.DebitCollectionPayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.SupplierPayment, com.tools20022.repository.codeset.PaymentPurposeCode.Hedging, com.tools20022.repository.codeset.PaymentPurposeCode.MultipleServiceTypes,
						com.tools20022.repository.codeset.PaymentPurposeCode.NotOtherwiseSpecified, com.tools20022.repository.codeset.PaymentPurposeCode.CardPayment, com.tools20022.repository.codeset.PaymentPurposeCode.CreditCardBill,
						com.tools20022.repository.codeset.PaymentPurposeCode.Ferry, com.tools20022.repository.codeset.PaymentPurposeCode.Air, com.tools20022.repository.codeset.PaymentPurposeCode.Bus,
						com.tools20022.repository.codeset.PaymentPurposeCode.Railway, com.tools20022.repository.codeset.PaymentPurposeCode.ConvalescentCareFacility, com.tools20022.repository.codeset.PaymentPurposeCode.DentalServices,
						com.tools20022.repository.codeset.PaymentPurposeCode.AnesthesiaServices, com.tools20022.repository.codeset.PaymentPurposeCode.HomeHealthCare, com.tools20022.repository.codeset.PaymentPurposeCode.HospitalCare,
						com.tools20022.repository.codeset.PaymentPurposeCode.IntermediateCareFacility, com.tools20022.repository.codeset.PaymentPurposeCode.LongTermCareFacility,
						com.tools20022.repository.codeset.PaymentPurposeCode.MedicalServices, com.tools20022.repository.codeset.PaymentPurposeCode.VisionCare, com.tools20022.repository.codeset.PaymentPurposeCode.DurableMedicaleEquipment,
						com.tools20022.repository.codeset.PaymentPurposeCode.CableTVBill, com.tools20022.repository.codeset.PaymentPurposeCode.ElectricityBill, com.tools20022.repository.codeset.PaymentPurposeCode.GasBill,
						com.tools20022.repository.codeset.PaymentPurposeCode.TelephoneBill, com.tools20022.repository.codeset.PaymentPurposeCode.OtherTelecomRelatedBill, com.tools20022.repository.codeset.PaymentPurposeCode.WaterBill,
						com.tools20022.repository.codeset.PaymentPurposeCode.Study, com.tools20022.repository.codeset.PaymentPurposeCode.PricePayment, com.tools20022.repository.codeset.PaymentPurposeCode.Installment,
						com.tools20022.repository.codeset.PaymentPurposeCode.RecurringInstallmentPayment, com.tools20022.repository.codeset.PaymentPurposeCode.OpeningFee,
						com.tools20022.repository.codeset.PaymentPurposeCode.CancellationFee, com.tools20022.repository.codeset.PaymentPurposeCode.GovernmentInsurance,
						com.tools20022.repository.codeset.PaymentPurposeCode.InsurancePremiumCar, com.tools20022.repository.codeset.PaymentPurposeCode.LaborInsurance, com.tools20022.repository.codeset.PaymentPurposeCode.LifeInsurance,
						com.tools20022.repository.codeset.PaymentPurposeCode.PropertyInsurance, com.tools20022.repository.codeset.PaymentPurposeCode.HealthInsurance,
						com.tools20022.repository.codeset.PaymentPurposeCode.CarLoanPrincipalRepayment, com.tools20022.repository.codeset.PaymentPurposeCode.HousingLoanRepayment,
						com.tools20022.repository.codeset.PaymentPurposeCode.CompanySocialLoanPaymentToBank, com.tools20022.repository.codeset.PaymentPurposeCode.EstateTax, com.tools20022.repository.codeset.PaymentPurposeCode.HousingTax,
						com.tools20022.repository.codeset.PaymentPurposeCode.IncomeTax, com.tools20022.repository.codeset.PaymentPurposeCode.NetIncomeTax, com.tools20022.repository.codeset.PaymentPurposeCode.BusinessExpenses,
						com.tools20022.repository.codeset.PaymentPurposeCode.TrustFund, com.tools20022.repository.codeset.PaymentPurposeCode.NetworkCharge, com.tools20022.repository.codeset.PaymentPurposeCode.NetworkCommunication,
						com.tools20022.repository.codeset.PaymentPurposeCode.ReceiptPayment, com.tools20022.repository.codeset.PaymentPurposeCode.PaymentTerms, com.tools20022.repository.codeset.PaymentPurposeCode.Other,
						com.tools20022.repository.codeset.PaymentPurposeCode.WithHolding);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SalaryPayment.getCodeName().get(), SalaryPayment);
		codesByName.put(TreasuryPayment.getCodeName().get(), TreasuryPayment);
		codesByName.put(AdvancePayment.getCodeName().get(), AdvancePayment);
		codesByName.put(AgriculturalTransfer.getCodeName().get(), AgriculturalTransfer);
		codesByName.put(AlimonyPayment.getCodeName().get(), AlimonyPayment);
		codesByName.put(ChildBenefit.getCodeName().get(), ChildBenefit);
		codesByName.put(UnemploymentDisabilityBenefit.getCodeName().get(), UnemploymentDisabilityBenefit);
		codesByName.put(BonusPayment.getCodeName().get(), BonusPayment);
		codesByName.put(CashManagementTransfer.getCodeName().get(), CashManagementTransfer);
		codesByName.put(CapitalBuilding.getCodeName().get(), CapitalBuilding);
		codesByName.put(CharityPayment.getCodeName().get(), CharityPayment);
		codesByName.put(CollectionPayment.getCodeName().get(), CollectionPayment);
		codesByName.put(CommodityTransfer.getCodeName().get(), CommodityTransfer);
		codesByName.put(CommercialPayment.getCodeName().get(), CommercialPayment);
		codesByName.put(Commission.getCodeName().get(), Commission);
		codesByName.put(Costs.getCodeName().get(), Costs);
		codesByName.put(Copyright.getCodeName().get(), Copyright);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(ForeignExchange.getCodeName().get(), ForeignExchange);
		codesByName.put(PurchaseSaleOfGoods.getCodeName().get(), PurchaseSaleOfGoods);
		codesByName.put(GovernmentPayment.getCodeName().get(), GovernmentPayment);
		codesByName.put(InstalmentHirePurchaseAgreement.getCodeName().get(), InstalmentHirePurchaseAgreement);
		codesByName.put(IntraCompanyPayment.getCodeName().get(), IntraCompanyPayment);
		codesByName.put(InsurancePremium.getCodeName().get(), InsurancePremium);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(LicenseFee.getCodeName().get(), LicenseFee);
		codesByName.put(Loan.getCodeName().get(), Loan);
		codesByName.put(LoanRepayment.getCodeName().get(), LoanRepayment);
		codesByName.put(Netting.getCodeName().get(), Netting);
		codesByName.put(Payroll.getCodeName().get(), Payroll);
		codesByName.put(PensionPayment.getCodeName().get(), PensionPayment);
		codesByName.put(Refund.getCodeName().get(), Refund);
		codesByName.put(Rent.getCodeName().get(), Rent);
		codesByName.put(Royalties.getCodeName().get(), Royalties);
		codesByName.put(PurchaseSaleOfServices.getCodeName().get(), PurchaseSaleOfServices);
		codesByName.put(Securities.getCodeName().get(), Securities);
		codesByName.put(SocialSecurityBenefit.getCodeName().get(), SocialSecurityBenefit);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(TaxPayment.getCodeName().get(), TaxPayment);
		codesByName.put(ValueAddedTaxPayment.getCodeName().get(), ValueAddedTaxPayment);
		codesByName.put(ConsumerThirdPartyConsolidatedPayment.getCodeName().get(), ConsumerThirdPartyConsolidatedPayment);
		codesByName.put(DebitCollectionPayment.getCodeName().get(), DebitCollectionPayment);
		codesByName.put(SupplierPayment.getCodeName().get(), SupplierPayment);
		codesByName.put(Hedging.getCodeName().get(), Hedging);
		codesByName.put(MultipleServiceTypes.getCodeName().get(), MultipleServiceTypes);
		codesByName.put(NotOtherwiseSpecified.getCodeName().get(), NotOtherwiseSpecified);
		codesByName.put(CardPayment.getCodeName().get(), CardPayment);
		codesByName.put(CreditCardBill.getCodeName().get(), CreditCardBill);
		codesByName.put(Ferry.getCodeName().get(), Ferry);
		codesByName.put(Air.getCodeName().get(), Air);
		codesByName.put(Bus.getCodeName().get(), Bus);
		codesByName.put(Railway.getCodeName().get(), Railway);
		codesByName.put(ConvalescentCareFacility.getCodeName().get(), ConvalescentCareFacility);
		codesByName.put(DentalServices.getCodeName().get(), DentalServices);
		codesByName.put(AnesthesiaServices.getCodeName().get(), AnesthesiaServices);
		codesByName.put(HomeHealthCare.getCodeName().get(), HomeHealthCare);
		codesByName.put(HospitalCare.getCodeName().get(), HospitalCare);
		codesByName.put(IntermediateCareFacility.getCodeName().get(), IntermediateCareFacility);
		codesByName.put(LongTermCareFacility.getCodeName().get(), LongTermCareFacility);
		codesByName.put(MedicalServices.getCodeName().get(), MedicalServices);
		codesByName.put(VisionCare.getCodeName().get(), VisionCare);
		codesByName.put(DurableMedicaleEquipment.getCodeName().get(), DurableMedicaleEquipment);
		codesByName.put(CableTVBill.getCodeName().get(), CableTVBill);
		codesByName.put(ElectricityBill.getCodeName().get(), ElectricityBill);
		codesByName.put(GasBill.getCodeName().get(), GasBill);
		codesByName.put(TelephoneBill.getCodeName().get(), TelephoneBill);
		codesByName.put(OtherTelecomRelatedBill.getCodeName().get(), OtherTelecomRelatedBill);
		codesByName.put(WaterBill.getCodeName().get(), WaterBill);
		codesByName.put(Study.getCodeName().get(), Study);
		codesByName.put(PricePayment.getCodeName().get(), PricePayment);
		codesByName.put(Installment.getCodeName().get(), Installment);
		codesByName.put(RecurringInstallmentPayment.getCodeName().get(), RecurringInstallmentPayment);
		codesByName.put(OpeningFee.getCodeName().get(), OpeningFee);
		codesByName.put(CancellationFee.getCodeName().get(), CancellationFee);
		codesByName.put(GovernmentInsurance.getCodeName().get(), GovernmentInsurance);
		codesByName.put(InsurancePremiumCar.getCodeName().get(), InsurancePremiumCar);
		codesByName.put(LaborInsurance.getCodeName().get(), LaborInsurance);
		codesByName.put(LifeInsurance.getCodeName().get(), LifeInsurance);
		codesByName.put(PropertyInsurance.getCodeName().get(), PropertyInsurance);
		codesByName.put(HealthInsurance.getCodeName().get(), HealthInsurance);
		codesByName.put(CarLoanPrincipalRepayment.getCodeName().get(), CarLoanPrincipalRepayment);
		codesByName.put(HousingLoanRepayment.getCodeName().get(), HousingLoanRepayment);
		codesByName.put(CompanySocialLoanPaymentToBank.getCodeName().get(), CompanySocialLoanPaymentToBank);
		codesByName.put(EstateTax.getCodeName().get(), EstateTax);
		codesByName.put(HousingTax.getCodeName().get(), HousingTax);
		codesByName.put(IncomeTax.getCodeName().get(), IncomeTax);
		codesByName.put(NetIncomeTax.getCodeName().get(), NetIncomeTax);
		codesByName.put(BusinessExpenses.getCodeName().get(), BusinessExpenses);
		codesByName.put(TrustFund.getCodeName().get(), TrustFund);
		codesByName.put(NetworkCharge.getCodeName().get(), NetworkCharge);
		codesByName.put(NetworkCommunication.getCodeName().get(), NetworkCommunication);
		codesByName.put(ReceiptPayment.getCodeName().get(), ReceiptPayment);
		codesByName.put(PaymentTerms.getCodeName().get(), PaymentTerms);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(WithHolding.getCodeName().get(), WithHolding);
	}

	public static PaymentPurposeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentPurposeCode[] values() {
		PaymentPurposeCode[] values = new PaymentPurposeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentPurposeCode> {
		@Override
		public PaymentPurposeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentPurposeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}