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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BillingChargeMethodCode;
import com.tools20022.repository.codeset.BillingCurrencyTypeCode;
import com.tools20022.repository.codeset.CompensationMethodCode;
import com.tools20022.repository.codeset.ServicePaymentMethodCode;
import com.tools20022.repository.entity.AccountService;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Services linked to an account which are available to the account owner or to
 * the holder of a mandate. The exercise of these services may be submitted to a
 * limit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashAccountService" src="doc-files/CashAccountService.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#CashAccountMandate
 * CashAccountService.CashAccountMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#CompensationMethod
 * CashAccountService.CompensationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#BillingCurrency
 * CashAccountService.BillingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#BillingChargeMethod
 * CashAccountService.BillingChargeMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#PaymentMethod
 * CashAccountService.PaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#CashAccountContract
 * CashAccountService.CashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#Identification
 * CashAccountService.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#CashAccount
 * CashAccountService.CashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedCashAccountService
 * GenericIdentification.RelatedCashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#CashAccountService
 * CashAccount.CashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#Services
 * CashAccountContract.Services}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccountMandate#Services
 * CashAccountMandate.Services}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod1#ServiceTax
 * BillingMethod1.ServiceTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod1#TotalCharge
 * BillingMethod1.TotalCharge}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod2#ServiceTax
 * BillingMethod2.ServiceTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification2#Identification
 * BillingServiceIdentification2.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification2#SubService
 * BillingServiceIdentification2.SubService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#BankService
 * BillingServiceParameters2.BankService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#TaxableServiceChargeConversion
 * TaxCalculation1.TaxableServiceChargeConversion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod4#ServiceDetail
 * BillingMethod4.ServiceDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#SubService
 * BillingServiceAdjustment1.SubService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#SubService
 * BillingServiceIdentification3.SubService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters3#BankService
 * BillingServiceParameters3.BankService}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#ServiceDetail
 * BillingService2.ServiceDetail}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#Compensation
 * BillingStatement2.Compensation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#Service
 * BillingStatement2.Service}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#ServiceAdjustment
 * BillingStatement2.ServiceAdjustment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashManagementService
 * CashManagementService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BankOperation BankOperation}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.DebitCreditFacility
 * DebitCreditFacility}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountService
 * AccountService}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingCompensation1
 * BillingCompensation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesAmount1
 * BillingServicesAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesAmount2
 * BillingServicesAmount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServiceIdentification2
 * BillingServiceIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServiceParameters2
 * BillingServiceParameters2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesAmount3
 * BillingServicesAmount3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
 * BillingServiceAdjustment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServiceIdentification3
 * BillingServiceIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServiceParameters3
 * BillingServiceParameters3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingService2
 * BillingService2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountService"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit."
 * </li>
 * </ul>
 */
public class CashAccountService extends AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Mandate which specifies the services that can be operated by the mandate
	 * holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#Services
	 * CashAccountMandate.Services}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountMandate
	 * CashAccountMandate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15#Mandate
	 * AccountReport15.Mandate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mandate which specifies the services that can be operated by the mandate holder."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccountMandate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport15.Mandate);
			elementContext_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountMandate";
			definition = "Mandate which specifies the services that can be operated by the mandate holder.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.Services;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines if and how charges and taxes due are paid to the account
	 * servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CompensationMethodCode
	 * CompensationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#CompensationMethod
	 * CashAccountCharacteristics2.CompensationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompensationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines if and how charges and taxes due are paid to the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CompensationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics2.CompensationMethod);
			elementContext_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CompensationMethod";
			definition = "Defines if and how charges and taxes due are paid to the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CompensationMethodCode.mmObject();
		}
	};
	/**
	 * Currency used for billing the services related to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyTypeCode
	 * BillingCurrencyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingBalance1#CurrencyType
	 * BillingBalance1.CurrencyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingCompensation1#CurrencyType
	 * BillingCompensation1.CurrencyType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency used for billing the services related to the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BillingCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingBalance1.CurrencyType, com.tools20022.repository.msg.BillingCompensation1.CurrencyType);
			elementContext_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BillingCurrency";
			definition = "Currency used for billing the services related to the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BillingCurrencyTypeCode.mmObject();
		}
	};
	/**
	 * Defines how the billing charge is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#Method
	 * BillingPrice1.Method}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingChargeMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines how the billing charge is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BillingChargeMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingPrice1.Method);
			elementContext_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BillingChargeMethod";
			definition = "Defines how the billing charge is calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BillingChargeMethodCode.mmObject();
		}
	};
	/**
	 * Specifies the different payment methods for an account service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode
	 * ServicePaymentMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#PaymentMethod
	 * BillingService2.PaymentMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different payment methods for an account service."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PaymentMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingService2.PaymentMethod);
			elementContext_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentMethod";
			definition = "Specifies the different payment methods for an account service.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ServicePaymentMethodCode.mmObject();
		}
	};
	/**
	 * Cash account contract which specifies the services linked to a cash
	 * account. It is derived from the association between AccountService and
	 * AccountContract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#Services
	 * CashAccountContract.Services}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash account contract which specifies the services linked to a cash account. It is derived from the association between AccountService and AccountContract."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccountContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccountContract";
			definition = "Cash account contract which specifies the services linked to a cash account. It is derived from the association between AccountService and AccountContract.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.Services;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the bank operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedCashAccountService
	 * GenericIdentification.RelatedCashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the bank operation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the bank operation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedCashAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash account for which services are specified. It is derived from the
	 * association between AccountService and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#CashAccountService
	 * CashAccount.CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash account for which services are specified. It is derived from the association between AccountService and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account for which services are specified. It is derived from the association between AccountService and Account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashAccountService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashAccountService";
				definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedCashAccountService, com.tools20022.repository.entity.CashAccount.CashAccountService,
						com.tools20022.repository.entity.CashAccountContract.Services, com.tools20022.repository.entity.CashAccountMandate.Services);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingMethod1.ServiceTax, com.tools20022.repository.msg.BillingMethod1.TotalCharge, com.tools20022.repository.msg.BillingMethod2.ServiceTax,
						com.tools20022.repository.msg.BillingServiceIdentification2.Identification, com.tools20022.repository.msg.BillingServiceIdentification2.SubService,
						com.tools20022.repository.msg.BillingServiceParameters2.BankService, com.tools20022.repository.msg.TaxCalculation1.TaxableServiceChargeConversion, com.tools20022.repository.msg.BillingMethod4.ServiceDetail,
						com.tools20022.repository.msg.BillingServiceAdjustment1.SubService, com.tools20022.repository.msg.BillingServiceIdentification3.SubService, com.tools20022.repository.msg.BillingServiceParameters3.BankService,
						com.tools20022.repository.msg.BillingService2.ServiceDetail, com.tools20022.repository.msg.BillingStatement2.Compensation, com.tools20022.repository.msg.BillingStatement2.Service,
						com.tools20022.repository.msg.BillingStatement2.ServiceAdjustment);
				subType_lazy = () -> Arrays.asList(CashManagementService.mmObject(), BankOperation.mmObject(), DebitCreditFacility.mmObject());
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountService.CashAccountMandate, com.tools20022.repository.entity.CashAccountService.CompensationMethod,
						com.tools20022.repository.entity.CashAccountService.BillingCurrency, com.tools20022.repository.entity.CashAccountService.BillingChargeMethod, com.tools20022.repository.entity.CashAccountService.PaymentMethod,
						com.tools20022.repository.entity.CashAccountService.CashAccountContract, com.tools20022.repository.entity.CashAccountService.Identification, com.tools20022.repository.entity.CashAccountService.CashAccount);
				derivationComponent_lazy = () -> Arrays.asList(BillingCompensation1.mmObject(), BillingServicesAmount1.mmObject(), BillingServicesAmount2.mmObject(), BillingServiceIdentification2.mmObject(),
						BillingServiceParameters2.mmObject(), BillingServicesAmount3.mmObject(), BillingServiceAdjustment1.mmObject(), BillingServiceIdentification3.mmObject(), BillingServiceParameters3.mmObject(),
						BillingService2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}