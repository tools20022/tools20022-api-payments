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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ServiceAdjustmentType1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection34;
import com.tools20022.repository.msg.BillingSubServiceIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the billing adjustments for a specific service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmType
 * BillingServiceAdjustment1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmDescription
 * BillingServiceAdjustment1.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmAmount
 * BillingServiceAdjustment1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmBalanceRequiredAmount
 * BillingServiceAdjustment1.mmBalanceRequiredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmErrorDate
 * BillingServiceAdjustment1.mmErrorDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmAdjustmentIdentification
 * BillingServiceAdjustment1.mmAdjustmentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmSubService
 * BillingServiceAdjustment1.mmSubService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmPriceChange
 * BillingServiceAdjustment1.mmPriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmOriginalPrice
 * BillingServiceAdjustment1.mmOriginalPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmNewPrice
 * BillingServiceAdjustment1.mmNewPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmVolumeChange
 * BillingServiceAdjustment1.mmVolumeChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmOriginalVolume
 * BillingServiceAdjustment1.mmOriginalVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmNewVolume
 * BillingServiceAdjustment1.mmNewVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmOriginalChargeAmount
 * BillingServiceAdjustment1.mmOriginalChargeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmNewChargeAmount
 * BillingServiceAdjustment1.mmNewChargeAmount}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BillingServiceAdjustment1", propOrder = {"type", "description", "amount", "balanceRequiredAmount", "errorDate", "adjustmentIdentification", "subService", "priceChange", "originalPrice", "newPrice", "volumeChange",
		"originalVolume", "newVolume", "originalChargeAmount", "newChargeAmount"})
public class BillingServiceAdjustment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected ServiceAdjustmentType1Code type;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Service#mmType
	 * Service.mmType}</li>
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
	public static final MMMessageAttribute<BillingServiceAdjustment1, ServiceAdjustmentType1Code> mmType = new MMMessageAttribute<BillingServiceAdjustment1, ServiceAdjustmentType1Code>() {
		{
			businessElementTrace_lazy = () -> Service.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Identifies the type of adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ServiceAdjustmentType1Code.mmObject();
		}

		@Override
		public ServiceAdjustmentType1Code getValue(BillingServiceAdjustment1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, ServiceAdjustmentType1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Desc", required = true)
	protected Max140Text description;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<BillingServiceAdjustment1, Max140Text> mmDescription = new MMMessageAttribute<BillingServiceAdjustment1, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Free-form description and clarification of the adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(BillingServiceAdjustment1 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Max140Text value) {
			obj.setDescription(value);
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected AmountAndDirection34 amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Service#mmAmount
	 * Service.mmAmount}</li>
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
	public static final MMMessageAssociationEnd<BillingServiceAdjustment1, AmountAndDirection34> mmAmount = new MMMessageAssociationEnd<BillingServiceAdjustment1, AmountAndDirection34>() {
		{
			businessElementTrace_lazy = () -> Service.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of the adjustment, expressed in the settlement currency.\n\nUsage: If the amount would reduce charges due then the amount should be negatively signed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public AmountAndDirection34 getValue(BillingServiceAdjustment1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, AmountAndDirection34 value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "BalReqrdAmt")
	protected AmountAndDirection34 balanceRequiredAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmAmount
	 * CashBalance.mmAmount}</li>
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
	public static final MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<AmountAndDirection34>> mmBalanceRequiredAmount = new MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<AmountAndDirection34>>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "BalReqrdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceRequiredAmount";
			definition = "Specifies whether the balance amount requires an adjustment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BillingServiceAdjustment1 obj) {
			return obj.getBalanceRequiredAmount();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Optional<AmountAndDirection34> value) {
			obj.setBalanceRequiredAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ErrDt")
	protected ISODate errorDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<BillingServiceAdjustment1, Optional<ISODate>> mmErrorDate = new MMMessageAttribute<BillingServiceAdjustment1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "ErrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorDate";
			definition = "Date on which the situation causing the service adjustment occurred. If the date is not known then used the last day of the month in which the situation occurred or the date of the billing statement which reported the original service to which this adjustment applies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(BillingServiceAdjustment1 obj) {
			return obj.getErrorDate();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Optional<ISODate> value) {
			obj.setErrorDate(value.orElse(null));
		}
	};
	@XmlElement(name = "AdjstmntId")
	protected Max35Text adjustmentIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<BillingServiceAdjustment1, Optional<Max35Text>> mmAdjustmentIdentification = new MMMessageAttribute<BillingServiceAdjustment1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "AdjstmntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentIdentification";
			definition = "Financial institution's own, internal service identification code, used to uniquely identify the service within the financial institution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(BillingServiceAdjustment1 obj) {
			return obj.getAdjustmentIdentification();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Optional<Max35Text> value) {
			obj.setAdjustmentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SubSvc")
	protected BillingSubServiceIdentification1 subService;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<BillingSubServiceIdentification1>> mmSubService = new MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<BillingSubServiceIdentification1>>() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "SubSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubService";
			definition = "Defines the financial institution sub-service identification if the financial institution service identification code is used for more than one service.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BillingSubServiceIdentification1.mmObject();
		}

		@Override
		public Optional<BillingSubServiceIdentification1> getValue(BillingServiceAdjustment1 obj) {
			return obj.getSubService();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Optional<BillingSubServiceIdentification1> value) {
			obj.setSubService(value.orElse(null));
		}
	};
	@XmlElement(name = "PricChng")
	protected AmountAndDirection34 priceChange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
	 * Product.mmUnitPrice}</li>
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
	public static final MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<AmountAndDirection34>> mmPriceChange = new MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<AmountAndDirection34>>() {
		{
			businessElementTrace_lazy = () -> Product.mmUnitPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "PricChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceChange";
			definition = "Change in the service price, expressed in the pricing currency. A negative value indicates a price reduction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BillingServiceAdjustment1 obj) {
			return obj.getPriceChange();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Optional<AmountAndDirection34> value) {
			obj.setPriceChange(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlPric")
	protected AmountAndDirection34 originalPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
	 * Product.mmUnitPrice}</li>
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
	public static final MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<AmountAndDirection34>> mmOriginalPrice = new MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<AmountAndDirection34>>() {
		{
			businessElementTrace_lazy = () -> Product.mmUnitPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPrice";
			definition = "Price that was applied to the service, prior to the change, expressed in the pricing currency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BillingServiceAdjustment1 obj) {
			return obj.getOriginalPrice();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Optional<AmountAndDirection34> value) {
			obj.setOriginalPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "NewPric")
	protected AmountAndDirection34 newPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
	 * Product.mmUnitPrice}</li>
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
	public static final MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<AmountAndDirection34>> mmNewPrice = new MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<AmountAndDirection34>>() {
		{
			businessElementTrace_lazy = () -> Product.mmUnitPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "NewPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPrice";
			definition = "New, adjusted service price, expressed in the pricing currency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BillingServiceAdjustment1 obj) {
			return obj.getNewPrice();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Optional<AmountAndDirection34> value) {
			obj.setNewPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "VolChng")
	protected DecimalNumber volumeChange;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmValue
	 * ProductQuantity.mmValue}</li>
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
	public static final MMMessageAttribute<BillingServiceAdjustment1, Optional<DecimalNumber>> mmVolumeChange = new MMMessageAttribute<BillingServiceAdjustment1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "VolChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeChange";
			definition = "Change in the service volume. A negative value indicates a volume reduction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(BillingServiceAdjustment1 obj) {
			return obj.getVolumeChange();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Optional<DecimalNumber> value) {
			obj.setVolumeChange(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlVol")
	protected DecimalNumber originalVolume;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmValue
	 * ProductQuantity.mmValue}</li>
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
	public static final MMMessageAttribute<BillingServiceAdjustment1, Optional<DecimalNumber>> mmOriginalVolume = new MMMessageAttribute<BillingServiceAdjustment1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlVol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalVolume";
			definition = "Original service volume.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(BillingServiceAdjustment1 obj) {
			return obj.getOriginalVolume();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Optional<DecimalNumber> value) {
			obj.setOriginalVolume(value.orElse(null));
		}
	};
	@XmlElement(name = "NewVol")
	protected DecimalNumber newVolume;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmValue
	 * ProductQuantity.mmValue}</li>
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
	public static final MMMessageAttribute<BillingServiceAdjustment1, Optional<DecimalNumber>> mmNewVolume = new MMMessageAttribute<BillingServiceAdjustment1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "NewVol";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewVolume";
			definition = "New, adjusted service volume.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(BillingServiceAdjustment1 obj) {
			return obj.getNewVolume();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Optional<DecimalNumber> value) {
			obj.setNewVolume(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlChrgAmt")
	protected AmountAndDirection34 originalChargeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Service#mmAmount
	 * Service.mmAmount}</li>
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
	public static final MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<AmountAndDirection34>> mmOriginalChargeAmount = new MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<AmountAndDirection34>>() {
		{
			businessElementTrace_lazy = () -> Service.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlChrgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalChargeAmount";
			definition = "Service charge that was applied to the service, prior to the change, expressed in the pricing currency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BillingServiceAdjustment1 obj) {
			return obj.getOriginalChargeAmount();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Optional<AmountAndDirection34> value) {
			obj.setOriginalChargeAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "NewChrgAmt")
	protected AmountAndDirection34 newChargeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Service#mmAmount
	 * Service.mmAmount}</li>
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
	public static final MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<AmountAndDirection34>> mmNewChargeAmount = new MMMessageAssociationEnd<BillingServiceAdjustment1, Optional<AmountAndDirection34>>() {
		{
			businessElementTrace_lazy = () -> Service.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BillingServiceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "NewChrgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewChargeAmount";
			definition = "New, adjusted service charge, expressed in the pricing currency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BillingServiceAdjustment1 obj) {
			return obj.getNewChargeAmount();
		}

		@Override
		public void setValue(BillingServiceAdjustment1 obj, Optional<AmountAndDirection34> value) {
			obj.setNewChargeAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingServiceAdjustment1.mmType, com.tools20022.repository.msg.BillingServiceAdjustment1.mmDescription,
						com.tools20022.repository.msg.BillingServiceAdjustment1.mmAmount, com.tools20022.repository.msg.BillingServiceAdjustment1.mmBalanceRequiredAmount, com.tools20022.repository.msg.BillingServiceAdjustment1.mmErrorDate,
						com.tools20022.repository.msg.BillingServiceAdjustment1.mmAdjustmentIdentification, com.tools20022.repository.msg.BillingServiceAdjustment1.mmSubService,
						com.tools20022.repository.msg.BillingServiceAdjustment1.mmPriceChange, com.tools20022.repository.msg.BillingServiceAdjustment1.mmOriginalPrice, com.tools20022.repository.msg.BillingServiceAdjustment1.mmNewPrice,
						com.tools20022.repository.msg.BillingServiceAdjustment1.mmVolumeChange, com.tools20022.repository.msg.BillingServiceAdjustment1.mmOriginalVolume, com.tools20022.repository.msg.BillingServiceAdjustment1.mmNewVolume,
						com.tools20022.repository.msg.BillingServiceAdjustment1.mmOriginalChargeAmount, com.tools20022.repository.msg.BillingServiceAdjustment1.mmNewChargeAmount);
				trace_lazy = () -> CashAccountService.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingServiceAdjustment1";
				definition = "Specifies the billing adjustments for a specific service.";
			}
		});
		return mmObject_lazy.get();
	}

	public ServiceAdjustmentType1Code getType() {
		return type;
	}

	public BillingServiceAdjustment1 setType(ServiceAdjustmentType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Max140Text getDescription() {
		return description;
	}

	public BillingServiceAdjustment1 setDescription(Max140Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public AmountAndDirection34 getAmount() {
		return amount;
	}

	public BillingServiceAdjustment1 setAmount(AmountAndDirection34 amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<AmountAndDirection34> getBalanceRequiredAmount() {
		return balanceRequiredAmount == null ? Optional.empty() : Optional.of(balanceRequiredAmount);
	}

	public BillingServiceAdjustment1 setBalanceRequiredAmount(AmountAndDirection34 balanceRequiredAmount) {
		this.balanceRequiredAmount = balanceRequiredAmount;
		return this;
	}

	public Optional<ISODate> getErrorDate() {
		return errorDate == null ? Optional.empty() : Optional.of(errorDate);
	}

	public BillingServiceAdjustment1 setErrorDate(ISODate errorDate) {
		this.errorDate = errorDate;
		return this;
	}

	public Optional<Max35Text> getAdjustmentIdentification() {
		return adjustmentIdentification == null ? Optional.empty() : Optional.of(adjustmentIdentification);
	}

	public BillingServiceAdjustment1 setAdjustmentIdentification(Max35Text adjustmentIdentification) {
		this.adjustmentIdentification = adjustmentIdentification;
		return this;
	}

	public Optional<BillingSubServiceIdentification1> getSubService() {
		return subService == null ? Optional.empty() : Optional.of(subService);
	}

	public BillingServiceAdjustment1 setSubService(BillingSubServiceIdentification1 subService) {
		this.subService = subService;
		return this;
	}

	public Optional<AmountAndDirection34> getPriceChange() {
		return priceChange == null ? Optional.empty() : Optional.of(priceChange);
	}

	public BillingServiceAdjustment1 setPriceChange(AmountAndDirection34 priceChange) {
		this.priceChange = priceChange;
		return this;
	}

	public Optional<AmountAndDirection34> getOriginalPrice() {
		return originalPrice == null ? Optional.empty() : Optional.of(originalPrice);
	}

	public BillingServiceAdjustment1 setOriginalPrice(AmountAndDirection34 originalPrice) {
		this.originalPrice = originalPrice;
		return this;
	}

	public Optional<AmountAndDirection34> getNewPrice() {
		return newPrice == null ? Optional.empty() : Optional.of(newPrice);
	}

	public BillingServiceAdjustment1 setNewPrice(AmountAndDirection34 newPrice) {
		this.newPrice = newPrice;
		return this;
	}

	public Optional<DecimalNumber> getVolumeChange() {
		return volumeChange == null ? Optional.empty() : Optional.of(volumeChange);
	}

	public BillingServiceAdjustment1 setVolumeChange(DecimalNumber volumeChange) {
		this.volumeChange = volumeChange;
		return this;
	}

	public Optional<DecimalNumber> getOriginalVolume() {
		return originalVolume == null ? Optional.empty() : Optional.of(originalVolume);
	}

	public BillingServiceAdjustment1 setOriginalVolume(DecimalNumber originalVolume) {
		this.originalVolume = originalVolume;
		return this;
	}

	public Optional<DecimalNumber> getNewVolume() {
		return newVolume == null ? Optional.empty() : Optional.of(newVolume);
	}

	public BillingServiceAdjustment1 setNewVolume(DecimalNumber newVolume) {
		this.newVolume = newVolume;
		return this;
	}

	public Optional<AmountAndDirection34> getOriginalChargeAmount() {
		return originalChargeAmount == null ? Optional.empty() : Optional.of(originalChargeAmount);
	}

	public BillingServiceAdjustment1 setOriginalChargeAmount(AmountAndDirection34 originalChargeAmount) {
		this.originalChargeAmount = originalChargeAmount;
		return this;
	}

	public Optional<AmountAndDirection34> getNewChargeAmount() {
		return newChargeAmount == null ? Optional.empty() : Optional.of(newChargeAmount);
	}

	public BillingServiceAdjustment1 setNewChargeAmount(AmountAndDirection34 newChargeAmount) {
		this.newChargeAmount = newChargeAmount;
		return this;
	}
}