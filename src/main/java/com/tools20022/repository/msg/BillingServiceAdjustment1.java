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
import com.tools20022.repository.codeset.ServiceAdjustmentType1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashAccountService;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the billing adjustments for a specific service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#Type
 * BillingServiceAdjustment1.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#Description
 * BillingServiceAdjustment1.Description}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#Amount
 * BillingServiceAdjustment1.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#BalanceRequiredAmount
 * BillingServiceAdjustment1.BalanceRequiredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#ErrorDate
 * BillingServiceAdjustment1.ErrorDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#AdjustmentIdentification
 * BillingServiceAdjustment1.AdjustmentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#SubService
 * BillingServiceAdjustment1.SubService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#PriceChange
 * BillingServiceAdjustment1.PriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#OriginalPrice
 * BillingServiceAdjustment1.OriginalPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#NewPrice
 * BillingServiceAdjustment1.NewPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#VolumeChange
 * BillingServiceAdjustment1.VolumeChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#OriginalVolume
 * BillingServiceAdjustment1.OriginalVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#NewVolume
 * BillingServiceAdjustment1.NewVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#OriginalChargeAmount
 * BillingServiceAdjustment1.OriginalChargeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#NewChargeAmount
 * BillingServiceAdjustment1.NewChargeAmount}</li>
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
 * "BillingServiceAdjustment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the billing adjustments for a specific service."</li>
 * </ul>
 */
public class BillingServiceAdjustment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the type of adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceAdjustmentType1Code
	 * ServiceAdjustmentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Service#Type Service.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of adjustment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Type = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Service.Type;
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Identifies the type of adjustment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ServiceAdjustmentType1Code.mmObject();
		}
	};
	/**
	 * Free-form description and clarification of the adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free-form description and clarification of the adjustment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Description = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Free-form description and clarification of the adjustment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Amount of the adjustment, expressed in the settlement currency.
	 * 
	 * Usage: If the amount would reduce charges due then the amount should be
	 * negatively signed.
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
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the adjustment, expressed in the settlement currency.\n\nUsage: If the amount would reduce charges due then the amount should be negatively signed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Amount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Service.Amount;
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of the adjustment, expressed in the settlement currency.\n\nUsage: If the amount would reduce charges due then the amount should be negatively signed.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies whether the balance amount requires an adjustment.
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
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalReqrdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceRequiredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the balance amount requires an adjustment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd BalanceRequiredAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashBalance.Amount;
			isDerived = false;
			xmlTag = "BalReqrdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceRequiredAmount";
			definition = "Specifies whether the balance amount requires an adjustment.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date on which the situation causing the service adjustment occurred. If
	 * the date is not known then used the last day of the month in which the
	 * situation occurred or the date of the billing statement which reported
	 * the original service to which this adjustment applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ErrDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the situation causing the service adjustment occurred. If the date is not known then used the last day of the month in which the situation occurred or the date of the billing statement which reported the original service to which this adjustment applies."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ErrorDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "ErrDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorDate";
			definition = "Date on which the situation causing the service adjustment occurred. If the date is not known then used the last day of the month in which the situation occurred or the date of the billing statement which reported the original service to which this adjustment applies.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Financial institution's own, internal service identification code, used
	 * to uniquely identify the service within the financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdjstmntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution's own, internal service identification code, used to uniquely identify the service within the financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AdjustmentIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "AdjstmntId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentIdentification";
			definition = "Financial institution's own, internal service identification code, used to uniquely identify the service within the financial institution.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Defines the financial institution sub-service identification if the
	 * financial institution service identification code is used for more than
	 * one service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BillingSubServiceIdentification1
	 * BillingSubServiceIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the financial institution sub-service identification if the financial institution service identification code is used for more than one service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SubService = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			isDerived = false;
			xmlTag = "SubSvc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubService";
			definition = "Defines the financial institution sub-service identification if the financial institution service identification code is used for more than one service.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BillingSubServiceIdentification1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Change in the service price, expressed in the pricing currency. A
	 * negative value indicates a price reduction.
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
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Change in the service price, expressed in the pricing currency. A negative value indicates a price reduction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PriceChange = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.UnitPrice;
			isDerived = false;
			xmlTag = "PricChng";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceChange";
			definition = "Change in the service price, expressed in the pricing currency. A negative value indicates a price reduction.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Price that was applied to the service, prior to the change, expressed in
	 * the pricing currency.
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
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price that was applied to the service, prior to the change, expressed in the pricing currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OriginalPrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.UnitPrice;
			isDerived = false;
			xmlTag = "OrgnlPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPrice";
			definition = "Price that was applied to the service, prior to the change, expressed in the pricing currency.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * New, adjusted service price, expressed in the pricing currency.
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
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New, adjusted service price, expressed in the pricing currency."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd NewPrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.UnitPrice;
			isDerived = false;
			xmlTag = "NewPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPrice";
			definition = "New, adjusted service price, expressed in the pricing currency.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Change in the service volume. A negative value indicates a volume
	 * reduction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#Value
	 * ProductQuantity.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VolChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolumeChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Change in the service volume. A negative value indicates a volume reduction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute VolumeChange = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ProductQuantity.Value;
			isDerived = false;
			xmlTag = "VolChng";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeChange";
			definition = "Change in the service volume. A negative value indicates a volume reduction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Original service volume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#Value
	 * ProductQuantity.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlVol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original service volume."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OriginalVolume = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ProductQuantity.Value;
			isDerived = false;
			xmlTag = "OrgnlVol";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalVolume";
			definition = "Original service volume.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * New, adjusted service volume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#Value
	 * ProductQuantity.Value}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewVol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New, adjusted service volume."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NewVolume = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ProductQuantity.Value;
			isDerived = false;
			xmlTag = "NewVol";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewVolume";
			definition = "New, adjusted service volume.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Service charge that was applied to the service, prior to the change,
	 * expressed in the pricing currency.
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
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlChrgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalChargeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Service charge that was applied to the service, prior to the change, expressed in the pricing currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OriginalChargeAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Service.Amount;
			isDerived = false;
			xmlTag = "OrgnlChrgAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalChargeAmount";
			definition = "Service charge that was applied to the service, prior to the change, expressed in the pricing currency.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
	/**
	 * New, adjusted service charge, expressed in the pricing currency.
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
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1
	 * BillingServiceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewChrgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewChargeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "New, adjusted service charge, expressed in the pricing currency."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd NewChargeAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingServiceAdjustment1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Service.Amount;
			isDerived = false;
			xmlTag = "NewChrgAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewChargeAmount";
			definition = "New, adjusted service charge, expressed in the pricing currency.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingServiceAdjustment1.Type, com.tools20022.repository.msg.BillingServiceAdjustment1.Description,
						com.tools20022.repository.msg.BillingServiceAdjustment1.Amount, com.tools20022.repository.msg.BillingServiceAdjustment1.BalanceRequiredAmount, com.tools20022.repository.msg.BillingServiceAdjustment1.ErrorDate,
						com.tools20022.repository.msg.BillingServiceAdjustment1.AdjustmentIdentification, com.tools20022.repository.msg.BillingServiceAdjustment1.SubService,
						com.tools20022.repository.msg.BillingServiceAdjustment1.PriceChange, com.tools20022.repository.msg.BillingServiceAdjustment1.OriginalPrice, com.tools20022.repository.msg.BillingServiceAdjustment1.NewPrice,
						com.tools20022.repository.msg.BillingServiceAdjustment1.VolumeChange, com.tools20022.repository.msg.BillingServiceAdjustment1.OriginalVolume, com.tools20022.repository.msg.BillingServiceAdjustment1.NewVolume,
						com.tools20022.repository.msg.BillingServiceAdjustment1.OriginalChargeAmount, com.tools20022.repository.msg.BillingServiceAdjustment1.NewChargeAmount);
				trace_lazy = () -> CashAccountService.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingServiceAdjustment1";
				definition = "Specifies the billing adjustments for a specific service.";
			}
		});
		return mmObject_lazy.get();
	}
}