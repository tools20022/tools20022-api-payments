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
import com.tools20022.repository.choice.EndPoint1Choice;
import com.tools20022.repository.choice.Frequency37Choice;
import com.tools20022.repository.codeset.BusinessDayConvention1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.entity.AccountSwitching;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details to specify the frequency, pattern and other items to allow for the
 * communication of a series of payments to be made to the same recipient over a
 * period of time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Frequency1#mmSequence
 * Frequency1.mmSequence}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Frequency1#mmStartDate
 * Frequency1.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Frequency1#mmEndPointChoice
 * Frequency1.mmEndPointChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Frequency1#mmRequestedFrequencyPattern
 * Frequency1.mmRequestedFrequencyPattern}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Frequency1#mmNonWorkingDayAdjustment
 * Frequency1.mmNonWorkingDayAdjustment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountSwitching
 * AccountSwitching}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Frequency1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details to specify the frequency, pattern and other items to allow for the communication of a series of payments to be made to the same recipient over a period of time."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Frequency1", propOrder = {"sequence", "startDate", "endPointChoice", "requestedFrequencyPattern", "nonWorkingDayAdjustment"})
public class Frequency1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Seq")
	protected Max3NumericText sequence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Frequency1
	 * Frequency1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Seq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Technical identifier of a Credit Transfer as part of a series of Credit Transfers within a single Payment Instruction. Assists the transfer of complex variable future payment schedules, associated with a single act of customer consent, within a single Payment Instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Frequency1, Optional<Max3NumericText>> mmSequence = new MMMessageAttribute<Frequency1, Optional<Max3NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Frequency1.mmObject();
			isDerived = false;
			xmlTag = "Seq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sequence";
			definition = "Technical identifier of a Credit Transfer as part of a series of Credit Transfers within a single Payment Instruction. Assists the transfer of complex variable future payment schedules, associated with a single act of customer consent, within a single Payment Instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Optional<Max3NumericText> getValue(Frequency1 obj) {
			return obj.getSequence();
		}

		@Override
		public void setValue(Frequency1 obj, Optional<Max3NumericText> value) {
			obj.setSequence(value.orElse(null));
		}
	};
	@XmlElement(name = "StartDt", required = true)
	protected ISODate startDate;
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
	 * {@linkplain com.tools20022.repository.entity.AccountSwitching#mmSwitchDate
	 * AccountSwitching.mmSwitchDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Frequency1
	 * Frequency1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The date of the first payment to be made for this payment schedule."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Frequency1, ISODate> mmStartDate = new MMMessageAttribute<Frequency1, ISODate>() {
		{
			businessElementTrace_lazy = () -> AccountSwitching.mmSwitchDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Frequency1.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "The date of the first payment to be made for this payment schedule.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Frequency1 obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(Frequency1 obj, ISODate value) {
			obj.setStartDate(value);
		}
	};
	@XmlElement(name = "EndPtChc", required = true)
	protected EndPoint1Choice endPointChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.EndPoint1Choice
	 * EndPoint1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Frequency1
	 * Frequency1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndPtChc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndPointChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about when the payment arrangement will end."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Frequency1, EndPoint1Choice> mmEndPointChoice = new MMMessageAssociationEnd<Frequency1, EndPoint1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Frequency1.mmObject();
			isDerived = false;
			xmlTag = "EndPtChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndPointChoice";
			definition = "Information about when the payment arrangement will end.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> EndPoint1Choice.mmObject();
		}

		@Override
		public EndPoint1Choice getValue(Frequency1 obj) {
			return obj.getEndPointChoice();
		}

		@Override
		public void setValue(Frequency1 obj, EndPoint1Choice value) {
			obj.setEndPointChoice(value);
		}
	};
	@XmlElement(name = "ReqdFrqcyPttrn")
	protected Frequency37Choice requestedFrequencyPattern;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Frequency37Choice
	 * Frequency37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Frequency1
	 * Frequency1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdFrqcyPttrn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedFrequencyPattern"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment schedule frequency pattern which indicates how frequently a payment is made."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Frequency1, Optional<Frequency37Choice>> mmRequestedFrequencyPattern = new MMMessageAssociationEnd<Frequency1, Optional<Frequency37Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Frequency1.mmObject();
			isDerived = false;
			xmlTag = "ReqdFrqcyPttrn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedFrequencyPattern";
			definition = "Payment schedule frequency pattern which indicates how frequently a payment is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Frequency37Choice.mmObject();
		}

		@Override
		public Optional<Frequency37Choice> getValue(Frequency1 obj) {
			return obj.getRequestedFrequencyPattern();
		}

		@Override
		public void setValue(Frequency1 obj, Optional<Frequency37Choice> value) {
			obj.setRequestedFrequencyPattern(value.orElse(null));
		}
	};
	@XmlElement(name = "NonWorkgDayAdjstmnt")
	protected BusinessDayConvention1Code nonWorkingDayAdjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConvention1Code
	 * BusinessDayConvention1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Frequency1
	 * Frequency1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonWorkgDayAdjstmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonWorkingDayAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment indicator for a non-working day to enable payment to be made on the next working day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Frequency1, Optional<BusinessDayConvention1Code>> mmNonWorkingDayAdjustment = new MMMessageAttribute<Frequency1, Optional<BusinessDayConvention1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Frequency1.mmObject();
			isDerived = false;
			xmlTag = "NonWorkgDayAdjstmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonWorkingDayAdjustment";
			definition = "Adjustment indicator for a non-working day to enable payment to be made on the next working day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BusinessDayConvention1Code.mmObject();
		}

		@Override
		public Optional<BusinessDayConvention1Code> getValue(Frequency1 obj) {
			return obj.getNonWorkingDayAdjustment();
		}

		@Override
		public void setValue(Frequency1 obj, Optional<BusinessDayConvention1Code> value) {
			obj.setNonWorkingDayAdjustment(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Frequency1.mmSequence, com.tools20022.repository.msg.Frequency1.mmStartDate, com.tools20022.repository.msg.Frequency1.mmEndPointChoice,
						com.tools20022.repository.msg.Frequency1.mmRequestedFrequencyPattern, com.tools20022.repository.msg.Frequency1.mmNonWorkingDayAdjustment);
				trace_lazy = () -> AccountSwitching.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Frequency1";
				definition = "Details to specify the frequency, pattern and other items to allow for the communication of a series of payments to be made to the same recipient over a period of time.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max3NumericText> getSequence() {
		return sequence == null ? Optional.empty() : Optional.of(sequence);
	}

	public Frequency1 setSequence(Max3NumericText sequence) {
		this.sequence = sequence;
		return this;
	}

	public ISODate getStartDate() {
		return startDate;
	}

	public Frequency1 setStartDate(ISODate startDate) {
		this.startDate = Objects.requireNonNull(startDate);
		return this;
	}

	public EndPoint1Choice getEndPointChoice() {
		return endPointChoice;
	}

	public Frequency1 setEndPointChoice(EndPoint1Choice endPointChoice) {
		this.endPointChoice = Objects.requireNonNull(endPointChoice);
		return this;
	}

	public Optional<Frequency37Choice> getRequestedFrequencyPattern() {
		return requestedFrequencyPattern == null ? Optional.empty() : Optional.of(requestedFrequencyPattern);
	}

	public Frequency1 setRequestedFrequencyPattern(Frequency37Choice requestedFrequencyPattern) {
		this.requestedFrequencyPattern = requestedFrequencyPattern;
		return this;
	}

	public Optional<BusinessDayConvention1Code> getNonWorkingDayAdjustment() {
		return nonWorkingDayAdjustment == null ? Optional.empty() : Optional.of(nonWorkingDayAdjustment);
	}

	public Frequency1 setNonWorkingDayAdjustment(BusinessDayConvention1Code nonWorkingDayAdjustment) {
		this.nonWorkingDayAdjustment = nonWorkingDayAdjustment;
		return this;
	}
}