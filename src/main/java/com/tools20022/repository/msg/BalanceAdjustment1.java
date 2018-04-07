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
import com.tools20022.repository.codeset.BalanceAdjustmentType1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection34;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the balance adjustments for a specific service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmType
 * BalanceAdjustment1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmDescription
 * BalanceAdjustment1.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmBalanceAmount
 * BalanceAdjustment1.mmBalanceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmAverageAmount
 * BalanceAdjustment1.mmAverageAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmErrorDate
 * BalanceAdjustment1.mmErrorDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmPostingDate
 * BalanceAdjustment1.mmPostingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmDays
 * BalanceAdjustment1.mmDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmEarningsAdjustmentAmount
 * BalanceAdjustment1.mmEarningsAdjustmentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashBalance
 * CashBalance}</li>
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
 * "BalanceAdjustment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the balance adjustments for a specific service."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BalanceAdjustment1", propOrder = {"type", "description", "balanceAmount", "averageAmount", "errorDate", "postingDate", "days", "earningsAdjustmentAmount"})
public class BalanceAdjustment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected BalanceAdjustmentType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentType1Code
	 * BalanceAdjustmentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmBalanceAdjustmentCode
	 * CashBalance.mmBalanceAdjustmentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
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
	public static final MMMessageAttribute<BalanceAdjustment1, BalanceAdjustmentType1Code> mmType = new MMMessageAttribute<BalanceAdjustment1, BalanceAdjustmentType1Code>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmBalanceAdjustmentCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Identifies the type of adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceAdjustmentType1Code.mmObject();
		}

		@Override
		public BalanceAdjustmentType1Code getValue(BalanceAdjustment1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(BalanceAdjustment1 obj, BalanceAdjustmentType1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Desc", required = true)
	protected Max105Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
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
	public static final MMMessageAttribute<BalanceAdjustment1, Max105Text> mmDescription = new MMMessageAttribute<BalanceAdjustment1, Max105Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Free-form description and clarification of the adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Max105Text getValue(BalanceAdjustment1 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(BalanceAdjustment1 obj, Max105Text value) {
			obj.setDescription(value);
		}
	};
	@XmlElement(name = "BalAmt", required = true)
	protected AmountAndDirection34 balanceAmount;
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the adjustment. If the amount would reduce the underlying balance then the amount should be negatively signed. Expressed in the Account currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BalanceAdjustment1, AmountAndDirection34> mmBalanceAmount = new MMMessageAssociationEnd<BalanceAdjustment1, AmountAndDirection34>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "BalAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceAmount";
			definition = "Amount of the adjustment. If the amount would reduce the underlying balance then the amount should be negatively signed. Expressed in the Account currency.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public AmountAndDirection34 getValue(BalanceAdjustment1 obj) {
			return obj.getBalanceAmount();
		}

		@Override
		public void setValue(BalanceAdjustment1 obj, AmountAndDirection34 value) {
			obj.setBalanceAmount(value);
		}
	};
	@XmlElement(name = "AvrgAmt")
	protected AmountAndDirection34 averageAmount;
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Day-weighted net amount of the adjustment to the average collected balance over the statement period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BalanceAdjustment1, Optional<AmountAndDirection34>> mmAverageAmount = new MMMessageAssociationEnd<BalanceAdjustment1, Optional<AmountAndDirection34>>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "AvrgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageAmount";
			definition = "Day-weighted net amount of the adjustment to the average collected balance over the statement period.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BalanceAdjustment1 obj) {
			return obj.getAverageAmount();
		}

		@Override
		public void setValue(BalanceAdjustment1 obj, Optional<AmountAndDirection34> value) {
			obj.setAverageAmount(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
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
	 * "Date on which the error occurred in the underlying cash account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceAdjustment1, Optional<ISODate>> mmErrorDate = new MMMessageAttribute<BalanceAdjustment1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "ErrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorDate";
			definition = "Date on which the error occurred in the underlying cash account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(BalanceAdjustment1 obj) {
			return obj.getErrorDate();
		}

		@Override
		public void setValue(BalanceAdjustment1 obj, Optional<ISODate> value) {
			obj.setErrorDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PstngDt", required = true)
	protected ISODate postingDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmEntryDate
	 * Entry.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the error was corrected in the cash account. If the date is not know then use the last day of the month in which the error was corrected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceAdjustment1, ISODate> mmPostingDate = new MMMessageAttribute<BalanceAdjustment1, ISODate>() {
		{
			businessElementTrace_lazy = () -> Entry.mmEntryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "PstngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingDate";
			definition = "Date on which the error was corrected in the cash account. If the date is not know then use the last day of the month in which the error was corrected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(BalanceAdjustment1 obj) {
			return obj.getPostingDate();
		}

		@Override
		public void setValue(BalanceAdjustment1 obj, ISODate value) {
			obj.setPostingDate(value);
		}
	};
	@XmlElement(name = "Days")
	protected DecimalNumber days;
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Days"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Days"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days within the period to which the adjustment applies."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BalanceAdjustment1, Optional<DecimalNumber>> mmDays = new MMMessageAttribute<BalanceAdjustment1, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "Days";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Days";
			definition = "Number of days within the period to which the adjustment applies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(BalanceAdjustment1 obj) {
			return obj.getDays();
		}

		@Override
		public void setValue(BalanceAdjustment1 obj, Optional<DecimalNumber> value) {
			obj.setDays(value.orElse(null));
		}
	};
	@XmlElement(name = "EarngsAdjstmntAmt")
	protected AmountAndDirection34 earningsAdjustmentAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAdjustment
	 * Balance.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1
	 * BalanceAdjustment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarngsAdjstmntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarningsAdjustmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Earnings credit adjustment, debit or credit, resulting from this adjustment’s effect on the average collected balance. If the amount would reduce the credit due then the amount should be negatively signed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BalanceAdjustment1, Optional<AmountAndDirection34>> mmEarningsAdjustmentAmount = new MMMessageAssociationEnd<BalanceAdjustment1, Optional<AmountAndDirection34>>() {
		{
			businessElementTrace_lazy = () -> Balance.mmAdjustment;
			componentContext_lazy = () -> com.tools20022.repository.msg.BalanceAdjustment1.mmObject();
			isDerived = false;
			xmlTag = "EarngsAdjstmntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarningsAdjustmentAmount";
			definition = "Earnings credit adjustment, debit or credit, resulting from this adjustment’s effect on the average collected balance. If the amount would reduce the credit due then the amount should be negatively signed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection34.mmObject();
		}

		@Override
		public Optional<AmountAndDirection34> getValue(BalanceAdjustment1 obj) {
			return obj.getEarningsAdjustmentAmount();
		}

		@Override
		public void setValue(BalanceAdjustment1 obj, Optional<AmountAndDirection34> value) {
			obj.setEarningsAdjustmentAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAdjustment1.mmType, com.tools20022.repository.msg.BalanceAdjustment1.mmDescription,
						com.tools20022.repository.msg.BalanceAdjustment1.mmBalanceAmount, com.tools20022.repository.msg.BalanceAdjustment1.mmAverageAmount, com.tools20022.repository.msg.BalanceAdjustment1.mmErrorDate,
						com.tools20022.repository.msg.BalanceAdjustment1.mmPostingDate, com.tools20022.repository.msg.BalanceAdjustment1.mmDays, com.tools20022.repository.msg.BalanceAdjustment1.mmEarningsAdjustmentAmount);
				trace_lazy = () -> CashBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceAdjustment1";
				definition = "Specifies the balance adjustments for a specific service.";
			}
		});
		return mmObject_lazy.get();
	}

	public BalanceAdjustmentType1Code getType() {
		return type;
	}

	public BalanceAdjustment1 setType(BalanceAdjustmentType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Max105Text getDescription() {
		return description;
	}

	public BalanceAdjustment1 setDescription(Max105Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public AmountAndDirection34 getBalanceAmount() {
		return balanceAmount;
	}

	public BalanceAdjustment1 setBalanceAmount(AmountAndDirection34 balanceAmount) {
		this.balanceAmount = Objects.requireNonNull(balanceAmount);
		return this;
	}

	public Optional<AmountAndDirection34> getAverageAmount() {
		return averageAmount == null ? Optional.empty() : Optional.of(averageAmount);
	}

	public BalanceAdjustment1 setAverageAmount(AmountAndDirection34 averageAmount) {
		this.averageAmount = averageAmount;
		return this;
	}

	public Optional<ISODate> getErrorDate() {
		return errorDate == null ? Optional.empty() : Optional.of(errorDate);
	}

	public BalanceAdjustment1 setErrorDate(ISODate errorDate) {
		this.errorDate = errorDate;
		return this;
	}

	public ISODate getPostingDate() {
		return postingDate;
	}

	public BalanceAdjustment1 setPostingDate(ISODate postingDate) {
		this.postingDate = Objects.requireNonNull(postingDate);
		return this;
	}

	public Optional<DecimalNumber> getDays() {
		return days == null ? Optional.empty() : Optional.of(days);
	}

	public BalanceAdjustment1 setDays(DecimalNumber days) {
		this.days = days;
		return this;
	}

	public Optional<AmountAndDirection34> getEarningsAdjustmentAmount() {
		return earningsAdjustmentAmount == null ? Optional.empty() : Optional.of(earningsAdjustmentAmount);
	}

	public BalanceAdjustment1 setEarningsAdjustmentAmount(AmountAndDirection34 earningsAdjustmentAmount) {
		this.earningsAdjustmentAmount = earningsAdjustmentAmount;
		return this;
	}
}