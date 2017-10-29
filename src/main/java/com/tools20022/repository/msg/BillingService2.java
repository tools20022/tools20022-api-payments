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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.BillingMethod1Choice;
import com.tools20022.repository.codeset.ServicePaymentMethod1Code;
import com.tools20022.repository.entity.CashAccountService;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the values used for every line item service in the statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#ServiceDetail
 * BillingService2.ServiceDetail}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#Price
 * BillingService2.Price}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#PaymentMethod
 * BillingService2.PaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService2#OriginalChargePrice
 * BillingService2.OriginalChargePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService2#OriginalChargeSettlementAmount
 * BillingService2.OriginalChargeSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService2#BalanceRequiredAccountAmount
 * BillingService2.BalanceRequiredAccountAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#TaxDesignation
 * BillingService2.TaxDesignation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#TaxCalculation
 * BillingService2.TaxCalculation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
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
 * "BillingService2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the values used for every line item service in the statement."</li>
 * </ul>
 */
public class BillingService2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies further detailed values for this service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters3
	 * BillingServiceParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcDtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceDetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies further detailed values for this service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ServiceDetail = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingService2.mmObject();
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			xmlTag = "SvcDtl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceDetail";
			definition = "Specifies further detailed values for this service.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> BillingServiceParameters3.mmObject();
		}
	};
	/**
	 * Price applied to the service, expressed in the pricing currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingPrice1
	 * BillingPrice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#UnitPrice
	 * Product.UnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price applied to the service, expressed in the pricing currency."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Price = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingService2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.UnitPrice;
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Price applied to the service, expressed in the pricing currency.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BillingPrice1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Code identifying the disposition of the calculated charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code
	 * ServicePaymentMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#PaymentMethod
	 * CashAccountService.PaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code identifying the disposition of the calculated charge."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PaymentMethod = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingService2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccountService.PaymentMethod;
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Code identifying the disposition of the calculated charge.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ServicePaymentMethod1Code.mmObject();
		}
	};
	/**
	 * Amount of the calculated charge, expressed in the pricing currency. This
	 * value does not include any tax on the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#UnitPrice
	 * Product.UnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlChrgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalChargePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the calculated charge, expressed in the pricing currency. This value does not include any tax on the service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OriginalChargePrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingService2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.UnitPrice;
			isDerived = false;
			xmlTag = "OrgnlChrgPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalChargePrice";
			definition = "Amount of the calculated charge, expressed in the pricing currency. This value does not include any tax on the service.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Amount of the calculated charge, expressed in the settlement currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Service#Amount
	 * Service.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlChrgSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalChargeSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the calculated charge, expressed in the settlement currency."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OriginalChargeSettlementAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingService2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Service.Amount;
			isDerived = false;
			xmlTag = "OrgnlChrgSttlmAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalChargeSettlementAmount";
			definition = "Amount of the calculated charge, expressed in the settlement currency.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Average daily collected balance required to offset a balance compensable
	 * service charge, exclusive of taxes, expressed in the account currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#Amount
	 * CashBalance.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalReqrdAcctAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceRequiredAccountAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Average daily collected balance required to offset a balance compensable service charge, exclusive of taxes, expressed in the account currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd BalanceRequiredAccountAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingService2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashBalance.Amount;
			isDerived = false;
			xmlTag = "BalReqrdAcctAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceRequiredAccountAmount";
			definition = "Average daily collected balance required to offset a balance compensable service charge, exclusive of taxes, expressed in the account currency.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides the details of the taxable status of a service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1
	 * ServiceTaxDesignation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#Record Tax.Record}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDsgnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDesignation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the details of the taxable status of a service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TaxDesignation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingService2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Record;
			isDerived = false;
			xmlTag = "TaxDsgnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDesignation";
			definition = "Provides the details of the taxable status of a service.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> ServiceTaxDesignation1.mmObject();
		}
	};
	/**
	 * Provides tax related values for tax calculation methods A, B or D.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice
	 * BillingMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#Tax Product.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxClctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides tax related values for  tax calculation methods A, B or D."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TaxCalculation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingService2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.Tax;
			isDerived = false;
			xmlTag = "TaxClctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCalculation";
			definition = "Provides tax related values for  tax calculation methods A, B or D.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> BillingMethod1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingService2.ServiceDetail, com.tools20022.repository.msg.BillingService2.Price, com.tools20022.repository.msg.BillingService2.PaymentMethod,
						com.tools20022.repository.msg.BillingService2.OriginalChargePrice, com.tools20022.repository.msg.BillingService2.OriginalChargeSettlementAmount,
						com.tools20022.repository.msg.BillingService2.BalanceRequiredAccountAmount, com.tools20022.repository.msg.BillingService2.TaxDesignation, com.tools20022.repository.msg.BillingService2.TaxCalculation);
				trace_lazy = () -> CashAccountService.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingService2";
				definition = "Specifies the values used for every line item service in the statement.";
			}
		});
		return mmObject_lazy.get();
	}
}