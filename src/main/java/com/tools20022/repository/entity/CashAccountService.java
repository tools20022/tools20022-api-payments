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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.BillingChargeMethodCode;
import com.tools20022.repository.codeset.BillingCurrencyTypeCode;
import com.tools20022.repository.codeset.CompensationMethodCode;
import com.tools20022.repository.codeset.ServicePaymentMethodCode;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountService
 * AccountService}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccountMandate
 * CashAccountService.mmCashAccountMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCompensationMethod
 * CashAccountService.mmCompensationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmBillingCurrency
 * CashAccountService.mmBillingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmBillingChargeMethod
 * CashAccountService.mmBillingChargeMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmPaymentMethod
 * CashAccountService.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccountContract
 * CashAccountService.mmCashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmIdentification
 * CashAccountService.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccount
 * CashAccountService.mmCashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCashAccountService
 * GenericIdentification.mmRelatedCashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountService
 * CashAccount.mmCashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmServices
 * CashAccountContract.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#mmServices
 * CashAccountMandate.mmServices}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod1#mmServiceTax
 * BillingMethod1.mmServiceTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod1#mmTotalCharge
 * BillingMethod1.mmTotalCharge}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod2#mmServiceTax
 * BillingMethod2.mmServiceTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification2#mmIdentification
 * BillingServiceIdentification2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification2#mmSubService
 * BillingServiceIdentification2.mmSubService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#mmBankService
 * BillingServiceParameters2.mmBankService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#mmTaxableServiceChargeConversion
 * TaxCalculation1.mmTaxableServiceChargeConversion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod4#mmServiceDetail
 * BillingMethod4.mmServiceDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmSubService
 * BillingServiceAdjustment1.mmSubService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceIdentification3#mmSubService
 * BillingServiceIdentification3.mmSubService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters3#mmBankService
 * BillingServiceParameters3.mmBankService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService2#mmServiceDetail
 * BillingService2.mmServiceDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmCompensation
 * BillingStatement2.mmCompensation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2#mmService
 * BillingStatement2.mmService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmServiceAdjustment
 * BillingStatement2.mmServiceAdjustment}</li>
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
 * <li>{@linkplain com.tools20022.repository.entity.AccountSwitching
 * AccountSwitching}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.msg.DirectDebitInstructionDetails1
 * DirectDebitInstructionDetails1}</li>
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
	protected List<com.tools20022.repository.entity.CashAccountMandate> cashAccountMandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#mmServices
	 * CashAccountMandate.mmServices}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport15#mmMandate
	 * AccountReport15.mmMandate}</li>
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
	public static final MMBusinessAssociationEnd<CashAccountService, List<CashAccountMandate>> mmCashAccountMandate = new MMBusinessAssociationEnd<CashAccountService, List<CashAccountMandate>>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountReport15.mmMandate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccountMandate";
			definition = "Mandate which specifies the services that can be operated by the mandate holder.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmServices;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmObject();
		}

		@Override
		public List<CashAccountMandate> getValue(CashAccountService obj) {
			return obj.getCashAccountMandate();
		}

		@Override
		public void setValue(CashAccountService obj, List<CashAccountMandate> value) {
			obj.setCashAccountMandate(value);
		}
	};
	protected CompensationMethodCode compensationMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmCompensationMethod
	 * CashAccountCharacteristics2.mmCompensationMethod}</li>
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
	public static final MMBusinessAttribute<CashAccountService, CompensationMethodCode> mmCompensationMethod = new MMBusinessAttribute<CashAccountService, CompensationMethodCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CashAccountCharacteristics2.mmCompensationMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompensationMethod";
			definition = "Defines if and how charges and taxes due are paid to the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CompensationMethodCode.mmObject();
		}

		@Override
		public CompensationMethodCode getValue(CashAccountService obj) {
			return obj.getCompensationMethod();
		}

		@Override
		public void setValue(CashAccountService obj, CompensationMethodCode value) {
			obj.setCompensationMethod(value);
		}
	};
	protected BillingCurrencyTypeCode billingCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BillingBalance1#mmCurrencyType
	 * BillingBalance1.mmCurrencyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingCompensation1#mmCurrencyType
	 * BillingCompensation1.mmCurrencyType}</li>
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
	public static final MMBusinessAttribute<CashAccountService, BillingCurrencyTypeCode> mmBillingCurrency = new MMBusinessAttribute<CashAccountService, BillingCurrencyTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BillingBalance1.mmCurrencyType, BillingCompensation1.mmCurrencyType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillingCurrency";
			definition = "Currency used for billing the services related to the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BillingCurrencyTypeCode.mmObject();
		}

		@Override
		public BillingCurrencyTypeCode getValue(CashAccountService obj) {
			return obj.getBillingCurrency();
		}

		@Override
		public void setValue(CashAccountService obj, BillingCurrencyTypeCode value) {
			obj.setBillingCurrency(value);
		}
	};
	protected BillingChargeMethodCode billingChargeMethod;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#mmMethod
	 * BillingPrice1.mmMethod}</li>
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
	public static final MMBusinessAttribute<CashAccountService, BillingChargeMethodCode> mmBillingChargeMethod = new MMBusinessAttribute<CashAccountService, BillingChargeMethodCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BillingPrice1.mmMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillingChargeMethod";
			definition = "Defines how the billing charge is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BillingChargeMethodCode.mmObject();
		}

		@Override
		public BillingChargeMethodCode getValue(CashAccountService obj) {
			return obj.getBillingChargeMethod();
		}

		@Override
		public void setValue(CashAccountService obj, BillingChargeMethodCode value) {
			obj.setBillingChargeMethod(value);
		}
	};
	protected ServicePaymentMethodCode paymentMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmPaymentMethod
	 * BillingService2.mmPaymentMethod}</li>
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
	public static final MMBusinessAttribute<CashAccountService, ServicePaymentMethodCode> mmPaymentMethod = new MMBusinessAttribute<CashAccountService, ServicePaymentMethodCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BillingService2.mmPaymentMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentMethod";
			definition = "Specifies the different payment methods for an account service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ServicePaymentMethodCode.mmObject();
		}

		@Override
		public ServicePaymentMethodCode getValue(CashAccountService obj) {
			return obj.getPaymentMethod();
		}

		@Override
		public void setValue(CashAccountService obj, ServicePaymentMethodCode value) {
			obj.setPaymentMethod(value);
		}
	};
	protected CashAccountContract cashAccountContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmServices
	 * CashAccountContract.mmServices}</li>
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
	public static final MMBusinessAssociationEnd<CashAccountService, com.tools20022.repository.entity.CashAccountContract> mmCashAccountContract = new MMBusinessAssociationEnd<CashAccountService, com.tools20022.repository.entity.CashAccountContract>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccountContract";
			definition = "Cash account contract which specifies the services linked to a cash account. It is derived from the association between AccountService and AccountContract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmServices;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.CashAccountContract getValue(CashAccountService obj) {
			return obj.getCashAccountContract();
		}

		@Override
		public void setValue(CashAccountService obj, com.tools20022.repository.entity.CashAccountContract value) {
			obj.setCashAccountContract(value);
		}
	};
	protected GenericIdentification identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCashAccountService
	 * GenericIdentification.mmRelatedCashAccountService}</li>
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
	public static final MMBusinessAssociationEnd<CashAccountService, GenericIdentification> mmIdentification = new MMBusinessAssociationEnd<CashAccountService, GenericIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the bank operation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmRelatedCashAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(CashAccountService obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(CashAccountService obj, GenericIdentification value) {
			obj.setIdentification(value);
		}
	};
	protected CashAccount cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountService
	 * CashAccount.mmCashAccountService}</li>
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
	public static final MMBusinessAssociationEnd<CashAccountService, com.tools20022.repository.entity.CashAccount> mmCashAccount = new MMBusinessAssociationEnd<CashAccountService, com.tools20022.repository.entity.CashAccount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account for which services are specified. It is derived from the association between AccountService and Account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCashAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.CashAccount getValue(CashAccountService obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(CashAccountService obj, com.tools20022.repository.entity.CashAccount value) {
			obj.setCashAccount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountService";
				definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmRelatedCashAccountService, com.tools20022.repository.entity.CashAccount.mmCashAccountService,
						com.tools20022.repository.entity.CashAccountContract.mmServices, com.tools20022.repository.entity.CashAccountMandate.mmServices);
				derivationElement_lazy = () -> Arrays.asList(BillingMethod1.mmServiceTax, BillingMethod1.mmTotalCharge, BillingMethod2.mmServiceTax, BillingServiceIdentification2.mmIdentification,
						BillingServiceIdentification2.mmSubService, BillingServiceParameters2.mmBankService, TaxCalculation1.mmTaxableServiceChargeConversion, BillingMethod4.mmServiceDetail, BillingServiceAdjustment1.mmSubService,
						BillingServiceIdentification3.mmSubService, BillingServiceParameters3.mmBankService, BillingService2.mmServiceDetail, BillingStatement2.mmCompensation, BillingStatement2.mmService,
						BillingStatement2.mmServiceAdjustment);
				subType_lazy = () -> Arrays.asList(CashManagementService.mmObject(), BankOperation.mmObject(), DebitCreditFacility.mmObject(), AccountSwitching.mmObject());
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountService.mmCashAccountMandate, com.tools20022.repository.entity.CashAccountService.mmCompensationMethod,
						com.tools20022.repository.entity.CashAccountService.mmBillingCurrency, com.tools20022.repository.entity.CashAccountService.mmBillingChargeMethod, com.tools20022.repository.entity.CashAccountService.mmPaymentMethod,
						com.tools20022.repository.entity.CashAccountService.mmCashAccountContract, com.tools20022.repository.entity.CashAccountService.mmIdentification, com.tools20022.repository.entity.CashAccountService.mmCashAccount);
				derivationComponent_lazy = () -> Arrays.asList(BillingCompensation1.mmObject(), BillingServicesAmount1.mmObject(), BillingServicesAmount2.mmObject(), BillingServiceIdentification2.mmObject(),
						BillingServiceParameters2.mmObject(), BillingServicesAmount3.mmObject(), BillingServiceAdjustment1.mmObject(), BillingServiceIdentification3.mmObject(), BillingServiceParameters3.mmObject(),
						BillingService2.mmObject(), DirectDebitInstructionDetails1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashAccountService.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccountMandate> getCashAccountMandate() {
		return cashAccountMandate == null ? cashAccountMandate = new ArrayList<>() : cashAccountMandate;
	}

	public CashAccountService setCashAccountMandate(List<com.tools20022.repository.entity.CashAccountMandate> cashAccountMandate) {
		this.cashAccountMandate = Objects.requireNonNull(cashAccountMandate);
		return this;
	}

	public CompensationMethodCode getCompensationMethod() {
		return compensationMethod;
	}

	public CashAccountService setCompensationMethod(CompensationMethodCode compensationMethod) {
		this.compensationMethod = Objects.requireNonNull(compensationMethod);
		return this;
	}

	public BillingCurrencyTypeCode getBillingCurrency() {
		return billingCurrency;
	}

	public CashAccountService setBillingCurrency(BillingCurrencyTypeCode billingCurrency) {
		this.billingCurrency = Objects.requireNonNull(billingCurrency);
		return this;
	}

	public BillingChargeMethodCode getBillingChargeMethod() {
		return billingChargeMethod;
	}

	public CashAccountService setBillingChargeMethod(BillingChargeMethodCode billingChargeMethod) {
		this.billingChargeMethod = Objects.requireNonNull(billingChargeMethod);
		return this;
	}

	public ServicePaymentMethodCode getPaymentMethod() {
		return paymentMethod;
	}

	public CashAccountService setPaymentMethod(ServicePaymentMethodCode paymentMethod) {
		this.paymentMethod = Objects.requireNonNull(paymentMethod);
		return this;
	}

	public CashAccountContract getCashAccountContract() {
		return cashAccountContract;
	}

	public CashAccountService setCashAccountContract(com.tools20022.repository.entity.CashAccountContract cashAccountContract) {
		this.cashAccountContract = Objects.requireNonNull(cashAccountContract);
		return this;
	}

	public GenericIdentification getIdentification() {
		return identification;
	}

	public CashAccountService setIdentification(GenericIdentification identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public CashAccount getCashAccount() {
		return cashAccount;
	}

	public CashAccountService setCashAccount(com.tools20022.repository.entity.CashAccount cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}
}