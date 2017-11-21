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
 * Specifies the type of transaction that resulted in a payment initiation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmSalaryPayment
 * PaymentPurposeCode.mmSalaryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmTreasuryPayment
 * PaymentPurposeCode.mmTreasuryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmAdvancePayment
 * PaymentPurposeCode.mmAdvancePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmAgriculturalTransfer
 * PaymentPurposeCode.mmAgriculturalTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmAlimonyPayment
 * PaymentPurposeCode.mmAlimonyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmChildBenefit
 * PaymentPurposeCode.mmChildBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmUnemploymentDisabilityBenefit
 * PaymentPurposeCode.mmUnemploymentDisabilityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmBonusPayment
 * PaymentPurposeCode.mmBonusPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCashManagementTransfer
 * PaymentPurposeCode.mmCashManagementTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCapitalBuilding
 * PaymentPurposeCode.mmCapitalBuilding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCharityPayment
 * PaymentPurposeCode.mmCharityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCollectionPayment
 * PaymentPurposeCode.mmCollectionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCommodityTransfer
 * PaymentPurposeCode.mmCommodityTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCommercialPayment
 * PaymentPurposeCode.mmCommercialPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCommission
 * PaymentPurposeCode.mmCommission}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCosts
 * PaymentPurposeCode.mmCosts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCopyright
 * PaymentPurposeCode.mmCopyright}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmDividend
 * PaymentPurposeCode.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmForeignExchange
 * PaymentPurposeCode.mmForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmPurchaseSaleOfGoods
 * PaymentPurposeCode.mmPurchaseSaleOfGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmGovernmentPayment
 * PaymentPurposeCode.mmGovernmentPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmInstalmentHirePurchaseAgreement
 * PaymentPurposeCode.mmInstalmentHirePurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmIntraCompanyPayment
 * PaymentPurposeCode.mmIntraCompanyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmInsurancePremium
 * PaymentPurposeCode.mmInsurancePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmInterest
 * PaymentPurposeCode.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmLicenseFee
 * PaymentPurposeCode.mmLicenseFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmLoan
 * PaymentPurposeCode.mmLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmLoanRepayment
 * PaymentPurposeCode.mmLoanRepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmNetting
 * PaymentPurposeCode.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmPayroll
 * PaymentPurposeCode.mmPayroll}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmPensionPayment
 * PaymentPurposeCode.mmPensionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmRefund
 * PaymentPurposeCode.mmRefund}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmRent
 * PaymentPurposeCode.mmRent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmRoyalties
 * PaymentPurposeCode.mmRoyalties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmPurchaseSaleOfServices
 * PaymentPurposeCode.mmPurchaseSaleOfServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmSecurities
 * PaymentPurposeCode.mmSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmSocialSecurityBenefit
 * PaymentPurposeCode.mmSocialSecurityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmSubscription
 * PaymentPurposeCode.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmTaxPayment
 * PaymentPurposeCode.mmTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmValueAddedTaxPayment
 * PaymentPurposeCode.mmValueAddedTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmConsumerThirdPartyConsolidatedPayment
 * PaymentPurposeCode.mmConsumerThirdPartyConsolidatedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmDebitCollectionPayment
 * PaymentPurposeCode.mmDebitCollectionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmSupplierPayment
 * PaymentPurposeCode.mmSupplierPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmHedging
 * PaymentPurposeCode.mmHedging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmMultipleServiceTypes
 * PaymentPurposeCode.mmMultipleServiceTypes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmNotOtherwiseSpecified
 * PaymentPurposeCode.mmNotOtherwiseSpecified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCardPayment
 * PaymentPurposeCode.mmCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCreditCardBill
 * PaymentPurposeCode.mmCreditCardBill}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmFerry
 * PaymentPurposeCode.mmFerry}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmAir
 * PaymentPurposeCode.mmAir}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmBus
 * PaymentPurposeCode.mmBus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmRailway
 * PaymentPurposeCode.mmRailway}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmConvalescentCareFacility
 * PaymentPurposeCode.mmConvalescentCareFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmDentalServices
 * PaymentPurposeCode.mmDentalServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmAnesthesiaServices
 * PaymentPurposeCode.mmAnesthesiaServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmHomeHealthCare
 * PaymentPurposeCode.mmHomeHealthCare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmHospitalCare
 * PaymentPurposeCode.mmHospitalCare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmIntermediateCareFacility
 * PaymentPurposeCode.mmIntermediateCareFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmLongTermCareFacility
 * PaymentPurposeCode.mmLongTermCareFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmMedicalServices
 * PaymentPurposeCode.mmMedicalServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmVisionCare
 * PaymentPurposeCode.mmVisionCare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmDurableMedicaleEquipment
 * PaymentPurposeCode.mmDurableMedicaleEquipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCableTVBill
 * PaymentPurposeCode.mmCableTVBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmElectricityBill
 * PaymentPurposeCode.mmElectricityBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmGasBill
 * PaymentPurposeCode.mmGasBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmTelephoneBill
 * PaymentPurposeCode.mmTelephoneBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmOtherTelecomRelatedBill
 * PaymentPurposeCode.mmOtherTelecomRelatedBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmWaterBill
 * PaymentPurposeCode.mmWaterBill}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmStudy
 * PaymentPurposeCode.mmStudy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmPricePayment
 * PaymentPurposeCode.mmPricePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmInstallment
 * PaymentPurposeCode.mmInstallment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmRecurringInstallmentPayment
 * PaymentPurposeCode.mmRecurringInstallmentPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmOpeningFee
 * PaymentPurposeCode.mmOpeningFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCancellationFee
 * PaymentPurposeCode.mmCancellationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmGovernmentInsurance
 * PaymentPurposeCode.mmGovernmentInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmInsurancePremiumCar
 * PaymentPurposeCode.mmInsurancePremiumCar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmLaborInsurance
 * PaymentPurposeCode.mmLaborInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmLifeInsurance
 * PaymentPurposeCode.mmLifeInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmPropertyInsurance
 * PaymentPurposeCode.mmPropertyInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmHealthInsurance
 * PaymentPurposeCode.mmHealthInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCarLoanPrincipalRepayment
 * PaymentPurposeCode.mmCarLoanPrincipalRepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmHousingLoanRepayment
 * PaymentPurposeCode.mmHousingLoanRepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmCompanySocialLoanPaymentToBank
 * PaymentPurposeCode.mmCompanySocialLoanPaymentToBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmEstateTax
 * PaymentPurposeCode.mmEstateTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmHousingTax
 * PaymentPurposeCode.mmHousingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmIncomeTax
 * PaymentPurposeCode.mmIncomeTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmNetIncomeTax
 * PaymentPurposeCode.mmNetIncomeTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmBusinessExpenses
 * PaymentPurposeCode.mmBusinessExpenses}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmTrustFund
 * PaymentPurposeCode.mmTrustFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmNetworkCharge
 * PaymentPurposeCode.mmNetworkCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmNetworkCommunication
 * PaymentPurposeCode.mmNetworkCommunication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmReceiptPayment
 * PaymentPurposeCode.mmReceiptPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmPaymentTerms
 * PaymentPurposeCode.mmPaymentTerms}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmOther
 * PaymentPurposeCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentPurposeCode#mmWithHolding
 * PaymentPurposeCode.mmWithHolding}</li>
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
public class PaymentPurposeCode {

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
	public static final MMCode mmSalaryPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SalaryPayment";
			definition = "Transaction is the payment of salaries.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmTreasuryPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasuryPayment";
			definition = "Transaction is related to treasury operations.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmAdvancePayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdvancePayment";
			definition = "Transaction is an advance payment.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmAgriculturalTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AgriculturalTransfer";
			definition = "Transaction is related to the agricultural domain.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmAlimonyPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AlimonyPayment";
			definition = "Transaction is the payment of alimony.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmChildBenefit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChildBenefit";
			definition = "Transaction is related to a payment made to assist parent/guardian to maintain child.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmUnemploymentDisabilityBenefit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnemploymentDisabilityBenefit";
			definition = "Transaction is related to a payment to a person who is unemployed/disabled.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmBonusPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BonusPayment";
			definition = "Transaction is related to payment of a bonus.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCashManagementTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashManagementTransfer";
			definition = "Transaction is a general cash management instruction.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCapitalBuilding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalBuilding";
			definition = "Transaction is related to capital building fringe fortune, ie capital building for retirement.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCharityPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CharityPayment";
			definition = "Transaction is a payment for charity reasons.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCollectionPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionPayment";
			definition = "Transaction is a collection of funds initiated via a credit transfer or direct debit.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCommodityTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommodityTransfer";
			definition = "Transaction is payment of commodities.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "CMDT";
		}
	};
	/**
	 * Transaction is related to a payment of commercial credit or debit.
	 * (formerly CommercialCredit)
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
	 * "Transaction is related to a payment of commercial credit or debit. (formerly CommercialCredit)"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCommercialPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommercialPayment";
			definition = "Transaction is related to a payment of commercial credit or debit. (formerly CommercialCredit)";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCommission = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Transaction is payment of commission.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCosts = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Costs";
			definition = "Transaction is related to payment of costs.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCopyright = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Copyright";
			definition = "Transaction is payment of copyright.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Transaction is payment of dividends.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmForeignExchange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchange";
			definition = "Transaction is related to a foreign exchange operation.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmPurchaseSaleOfGoods = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseSaleOfGoods";
			definition = "Transaction is related to purchase and sale of goods.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmGovernmentPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GovernmentPayment";
			definition = "Transaction is a payment to or from a government department.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmInstalmentHirePurchaseAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstalmentHirePurchaseAgreement";
			definition = "Transaction is payment for an installment/hire-purchase agreement.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmIntraCompanyPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntraCompanyPayment";
			definition = "Transaction is an intra-company payment, ie, a payment between two companies belonging to the same group.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmInsurancePremium = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsurancePremium";
			definition = "Transaction is payment of an insurance premium.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Transaction is payment of interest.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmLicenseFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LicenseFee";
			definition = "Transaction is payment of a license fee.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmLoan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Loan";
			definition = "Transaction is related to transfer of loan to borrower.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmLoanRepayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LoanRepayment";
			definition = "Transaction is related to repayment of loan to lender.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmNetting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Transaction is related to a netting operation.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmPayroll = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payroll";
			definition = "Transaction is related to the payment of payroll.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmPensionPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PensionPayment";
			definition = "Transaction is the payment of pension.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmRefund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Refund";
			definition = "Transaction is the payment of a refund.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmRent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rent";
			definition = "Transaction is the payment of rent.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmRoyalties = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Royalties";
			definition = "Transaction is the payment of royalties.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmPurchaseSaleOfServices = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PurchaseSaleOfServices";
			definition = "Transaction is related to purchase and sale of services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Securities";
			definition = "Transaction is the payment of securities.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmSocialSecurityBenefit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SocialSecurityBenefit";
			definition = "Transaction is a social security benefit, ie payment made by a government to support individuals.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmSubscription = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "Transaction is related to a payment of information or entertainment services either in printed or electronic form.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmTaxPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxPayment";
			definition = "Transaction is the payment of taxes.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmValueAddedTaxPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueAddedTaxPayment";
			definition = "Transaction is the payment of value added tax.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmConsumerThirdPartyConsolidatedPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConsumerThirdPartyConsolidatedPayment";
			definition = "Transaction is a payment used by a third party who can collect funds to pay on behalf of consumers, ie credit counseling or bill payment companies.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmDebitCollectionPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitCollectionPayment";
			definition = "Collection of funds initiated via a debit transfer.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmSupplierPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SupplierPayment";
			definition = "Transaction is related to a payment to a supplier.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmHedging = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Hedging";
			definition = "Transaction is related to a hedging operation.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmMultipleServiceTypes = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MultipleServiceTypes";
			definition = "Transaction is related to a payment for multiple service types.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmNotOtherwiseSpecified = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotOtherwiseSpecified";
			definition = "Transaction is related to a payment for type of services not specified elsewhere.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCardPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Transaction is related to a payment of credit card account.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCreditCardBill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditCardBill";
			definition = "Transaction is related to a payment of credit card bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmFerry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ferry";
			definition = "Transaction is a payment for ferry related business.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmAir = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Air";
			definition = "Transaction is a payment for air transport related business.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmBus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bus";
			definition = "Transaction is a payment for bus transport related business.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmRailway = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Railway";
			definition = "Transaction is a payment for railway transport related business.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmConvalescentCareFacility = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConvalescentCareFacility";
			definition = "Transaction is a payment for convalescence care facility services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmDentalServices = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DentalServices";
			definition = "Transaction is a payment for dental services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmAnesthesiaServices = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnesthesiaServices";
			definition = "Transaction is a payment for anesthesia services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmHomeHealthCare = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HomeHealthCare";
			definition = "Transaction is a payment for home health care services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmHospitalCare = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HospitalCare";
			definition = "Transaction is a payment for hospital care services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmIntermediateCareFacility = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateCareFacility";
			definition = "Transaction is a payment for intermediate care facility services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmLongTermCareFacility = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LongTermCareFacility";
			definition = "Transaction is a payment for long-term care facility services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmMedicalServices = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MedicalServices";
			definition = "Transaction is a payment for medical care services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmVisionCare = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VisionCare";
			definition = "Transaction is a payment for vision care services.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmDurableMedicaleEquipment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DurableMedicaleEquipment";
			definition = "Transaction is a payment is for use of durable medical equipment.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCableTVBill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CableTVBill";
			definition = "Transaction is related to a payment of cable TV bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmElectricityBill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectricityBill";
			definition = "Transaction is related to a payment of electricity bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmGasBill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GasBill";
			definition = "Transaction is related to a payment of gas bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmTelephoneBill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TelephoneBill";
			definition = "Transaction is related to a payment of telephone bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmOtherTelecomRelatedBill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherTelecomRelatedBill";
			definition = "Transaction is related to a payment of other telecom related bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmWaterBill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WaterBill";
			definition = "Transaction is related to a payment of water bill.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmStudy = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Study";
			definition = "Transaction is related to a payment of study/tuition costs.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmPricePayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PricePayment";
			definition = "Transaction is related to a payment of a price.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmInstallment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Installment";
			definition = "Transaction is related to a payment of an installment.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmRecurringInstallmentPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RecurringInstallmentPayment";
			definition = "Transaction is related to a payment of a recurring installment made at regular intervals.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmOpeningFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningFee";
			definition = "Transaction is related to a payment of opening fee.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCancellationFee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationFee";
			definition = "Transaction is related to a payment of cancellation fee.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmGovernmentInsurance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GovernmentInsurance";
			definition = "Transaction is related to a payment of government insurance.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmInsurancePremiumCar = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsurancePremiumCar";
			definition = "Transaction is a payment of car insurance premium.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmLaborInsurance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LaborInsurance";
			definition = "Transaction is a payment of labor insurance.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmLifeInsurance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LifeInsurance";
			definition = "Transaction is a payment of life insurance.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmPropertyInsurance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PropertyInsurance";
			definition = "Transaction is a payment of property insurance.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmHealthInsurance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HealthInsurance";
			definition = "Transaction is a payment of health insurance.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCarLoanPrincipalRepayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CarLoanPrincipalRepayment";
			definition = "Transaction is a payment of car loan principal payment.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmHousingLoanRepayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HousingLoanRepayment";
			definition = "Transaction is related to a payment of housing loan.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmCompanySocialLoanPaymentToBank = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompanySocialLoanPaymentToBank";
			definition = "Transaction is a payment by a company to a bank for financing social loans to employees.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmEstateTax = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstateTax";
			definition = "Transaction is related to a payment of estate tax.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmHousingTax = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HousingTax";
			definition = "Transaction is related to a payment of housing tax.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmIncomeTax = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncomeTax";
			definition = "Transaction is related to a payment of income tax.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmNetIncomeTax = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetIncomeTax";
			definition = "Transaction is related to a payment of net income tax.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmBusinessExpenses = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BusinessExpenses";
			definition = "Transaction is related to a payment of business expenses.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmTrustFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TrustFund";
			definition = "Transaction is related to a payment of a trust fund.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmNetworkCharge = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetworkCharge";
			definition = "Transaction is related to a payment of network charges.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmNetworkCommunication = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetworkCommunication";
			definition = "Transaction is related to a payment of network communication.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmReceiptPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReceiptPayment";
			definition = "Transaction is related to a payment of receipt.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "RCPT";
		}
	};
	/**
	 * Transaction is related to payment terms specifications
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
	 * definition} = "Transaction is related to payment terms specifications"</li>
	 * </ul>
	 */
	public static final MMCode mmPaymentTerms = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentTerms";
			definition = "Transaction is related to payment terms specifications";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Other payment purpose.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
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
	public static final MMCode mmWithHolding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithHolding";
			definition = "Transaction is related to a payment of withholding tax.";
			owner_lazy = () -> PaymentPurposeCode.mmObject();
			codeName = "WHLD";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SALA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentPurposeCode";
				definition = "Specifies the type of transaction that resulted in a payment initiation.";
				code_lazy = () -> Arrays.asList(PaymentPurposeCode.mmSalaryPayment, PaymentPurposeCode.mmTreasuryPayment, PaymentPurposeCode.mmAdvancePayment, PaymentPurposeCode.mmAgriculturalTransfer, PaymentPurposeCode.mmAlimonyPayment,
						PaymentPurposeCode.mmChildBenefit, PaymentPurposeCode.mmUnemploymentDisabilityBenefit, PaymentPurposeCode.mmBonusPayment, PaymentPurposeCode.mmCashManagementTransfer, PaymentPurposeCode.mmCapitalBuilding,
						PaymentPurposeCode.mmCharityPayment, PaymentPurposeCode.mmCollectionPayment, PaymentPurposeCode.mmCommodityTransfer, PaymentPurposeCode.mmCommercialPayment, PaymentPurposeCode.mmCommission,
						PaymentPurposeCode.mmCosts, PaymentPurposeCode.mmCopyright, PaymentPurposeCode.mmDividend, PaymentPurposeCode.mmForeignExchange, PaymentPurposeCode.mmPurchaseSaleOfGoods, PaymentPurposeCode.mmGovernmentPayment,
						PaymentPurposeCode.mmInstalmentHirePurchaseAgreement, PaymentPurposeCode.mmIntraCompanyPayment, PaymentPurposeCode.mmInsurancePremium, PaymentPurposeCode.mmInterest, PaymentPurposeCode.mmLicenseFee,
						PaymentPurposeCode.mmLoan, PaymentPurposeCode.mmLoanRepayment, PaymentPurposeCode.mmNetting, PaymentPurposeCode.mmPayroll, PaymentPurposeCode.mmPensionPayment, PaymentPurposeCode.mmRefund, PaymentPurposeCode.mmRent,
						PaymentPurposeCode.mmRoyalties, PaymentPurposeCode.mmPurchaseSaleOfServices, PaymentPurposeCode.mmSecurities, PaymentPurposeCode.mmSocialSecurityBenefit, PaymentPurposeCode.mmSubscription,
						PaymentPurposeCode.mmTaxPayment, PaymentPurposeCode.mmValueAddedTaxPayment, PaymentPurposeCode.mmConsumerThirdPartyConsolidatedPayment, PaymentPurposeCode.mmDebitCollectionPayment,
						PaymentPurposeCode.mmSupplierPayment, PaymentPurposeCode.mmHedging, PaymentPurposeCode.mmMultipleServiceTypes, PaymentPurposeCode.mmNotOtherwiseSpecified, PaymentPurposeCode.mmCardPayment,
						PaymentPurposeCode.mmCreditCardBill, PaymentPurposeCode.mmFerry, PaymentPurposeCode.mmAir, PaymentPurposeCode.mmBus, PaymentPurposeCode.mmRailway, PaymentPurposeCode.mmConvalescentCareFacility,
						PaymentPurposeCode.mmDentalServices, PaymentPurposeCode.mmAnesthesiaServices, PaymentPurposeCode.mmHomeHealthCare, PaymentPurposeCode.mmHospitalCare, PaymentPurposeCode.mmIntermediateCareFacility,
						PaymentPurposeCode.mmLongTermCareFacility, PaymentPurposeCode.mmMedicalServices, PaymentPurposeCode.mmVisionCare, PaymentPurposeCode.mmDurableMedicaleEquipment, PaymentPurposeCode.mmCableTVBill,
						PaymentPurposeCode.mmElectricityBill, PaymentPurposeCode.mmGasBill, PaymentPurposeCode.mmTelephoneBill, PaymentPurposeCode.mmOtherTelecomRelatedBill, PaymentPurposeCode.mmWaterBill, PaymentPurposeCode.mmStudy,
						PaymentPurposeCode.mmPricePayment, PaymentPurposeCode.mmInstallment, PaymentPurposeCode.mmRecurringInstallmentPayment, PaymentPurposeCode.mmOpeningFee, PaymentPurposeCode.mmCancellationFee,
						PaymentPurposeCode.mmGovernmentInsurance, PaymentPurposeCode.mmInsurancePremiumCar, PaymentPurposeCode.mmLaborInsurance, PaymentPurposeCode.mmLifeInsurance, PaymentPurposeCode.mmPropertyInsurance,
						PaymentPurposeCode.mmHealthInsurance, PaymentPurposeCode.mmCarLoanPrincipalRepayment, PaymentPurposeCode.mmHousingLoanRepayment, PaymentPurposeCode.mmCompanySocialLoanPaymentToBank, PaymentPurposeCode.mmEstateTax,
						PaymentPurposeCode.mmHousingTax, PaymentPurposeCode.mmIncomeTax, PaymentPurposeCode.mmNetIncomeTax, PaymentPurposeCode.mmBusinessExpenses, PaymentPurposeCode.mmTrustFund, PaymentPurposeCode.mmNetworkCharge,
						PaymentPurposeCode.mmNetworkCommunication, PaymentPurposeCode.mmReceiptPayment, PaymentPurposeCode.mmPaymentTerms, PaymentPurposeCode.mmOther, PaymentPurposeCode.mmWithHolding);
			}
		});
		return mmObject_lazy.get();
	}
}