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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
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
 * Provides further information required for the account switch.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferInstruction1#mmTransferIndicator
 * TransferInstruction1.mmTransferIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransferInstruction1#mmCode
 * TransferInstruction1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferInstruction1#mmProprietary
 * TransferInstruction1.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferInstruction1#mmStartDateTime
 * TransferInstruction1.mmStartDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferInstruction1#mmStartDate
 * TransferInstruction1.mmStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferInstruction1#mmDescription
 * TransferInstruction1.mmDescription}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferInstruction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides further information required for the account switch."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransferInstruction1", propOrder = {"transferIndicator", "code", "proprietary", "startDateTime", "startDate", "description"})
public class TransferInstruction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrfInd")
	protected YesNoIndicator transferIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferInstruction1
	 * TransferInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a payment arrangement is transferable.\r\n\r\nUsage: Default value for TransferIndicator is false."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferInstruction1, Optional<YesNoIndicator>> mmTransferIndicator = new MMMessageAttribute<TransferInstruction1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferInstruction1.mmObject();
			isDerived = false;
			xmlTag = "TrfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIndicator";
			definition = "Indicates whether a payment arrangement is transferable.\r\n\r\nUsage: Default value for TransferIndicator is false.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(TransferInstruction1 obj) {
			return obj.getTransferIndicator();
		}

		@Override
		public void setValue(TransferInstruction1 obj, Optional<YesNoIndicator> value) {
			obj.setTransferIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Cd", required = true)
	protected Max35Text code;
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
	 * {@linkplain com.tools20022.repository.msg.TransferInstruction1
	 * TransferInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an additional parameter to be applied to the requested transaction schedule."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferInstruction1, Max35Text> mmCode = new MMMessageAttribute<TransferInstruction1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferInstruction1.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies an additional parameter to be applied to the requested transaction schedule.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TransferInstruction1 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(TransferInstruction1 obj, Max35Text value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Prtry")
	protected Max256Text proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferInstruction1
	 * TransferInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an additional parameter to be applied to the transaction schedule in a proprietary format."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferInstruction1, Optional<Max256Text>> mmProprietary = new MMMessageAttribute<TransferInstruction1, Optional<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferInstruction1.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Specifies an additional parameter to be applied to the transaction schedule in a proprietary format.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(TransferInstruction1 obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(TransferInstruction1 obj, Optional<Max256Text> value) {
			obj.setProprietary(value.orElse(null));
		}
	};
	@XmlElement(name = "StartDtTm")
	protected ISODateTime startDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferInstruction1
	 * TransferInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The date and time at which the event specified by Code commences."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferInstruction1, Optional<ISODateTime>> mmStartDateTime = new MMMessageAttribute<TransferInstruction1, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferInstruction1.mmObject();
			isDerived = false;
			xmlTag = "StartDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDateTime";
			definition = "The date and time at which the event specified by Code commences.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(TransferInstruction1 obj) {
			return obj.getStartDateTime();
		}

		@Override
		public void setValue(TransferInstruction1 obj, Optional<ISODateTime> value) {
			obj.setStartDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "StartDt")
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferInstruction1
	 * TransferInstruction1}</li>
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
	 * definition} = "The date on which the event specified by Code commences."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferInstruction1, Optional<ISODate>> mmStartDate = new MMMessageAttribute<TransferInstruction1, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferInstruction1.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "The date on which the event specified by Code commences.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TransferInstruction1 obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(TransferInstruction1 obj, Optional<ISODate> value) {
			obj.setStartDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Desc")
	protected Max350Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferInstruction1
	 * TransferInstruction1}</li>
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
	 * definition} = "Additional switch parameters in a free text format.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferInstruction1, Optional<Max350Text>> mmDescription = new MMMessageAttribute<TransferInstruction1, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferInstruction1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Additional switch parameters in a free text format.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(TransferInstruction1 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(TransferInstruction1 obj, Optional<Max350Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferInstruction1.mmTransferIndicator, com.tools20022.repository.msg.TransferInstruction1.mmCode,
						com.tools20022.repository.msg.TransferInstruction1.mmProprietary, com.tools20022.repository.msg.TransferInstruction1.mmStartDateTime, com.tools20022.repository.msg.TransferInstruction1.mmStartDate,
						com.tools20022.repository.msg.TransferInstruction1.mmDescription);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransferInstruction1";
				definition = "Provides further information required for the account switch.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<YesNoIndicator> getTransferIndicator() {
		return transferIndicator == null ? Optional.empty() : Optional.of(transferIndicator);
	}

	public TransferInstruction1 setTransferIndicator(YesNoIndicator transferIndicator) {
		this.transferIndicator = transferIndicator;
		return this;
	}

	public Max35Text getCode() {
		return code;
	}

	public TransferInstruction1 setCode(Max35Text code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public Optional<Max256Text> getProprietary() {
		return proprietary == null ? Optional.empty() : Optional.of(proprietary);
	}

	public TransferInstruction1 setProprietary(Max256Text proprietary) {
		this.proprietary = proprietary;
		return this;
	}

	public Optional<ISODateTime> getStartDateTime() {
		return startDateTime == null ? Optional.empty() : Optional.of(startDateTime);
	}

	public TransferInstruction1 setStartDateTime(ISODateTime startDateTime) {
		this.startDateTime = startDateTime;
		return this;
	}

	public Optional<ISODate> getStartDate() {
		return startDate == null ? Optional.empty() : Optional.of(startDate);
	}

	public TransferInstruction1 setStartDate(ISODate startDate) {
		this.startDate = startDate;
		return this;
	}

	public Optional<Max350Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public TransferInstruction1 setDescription(Max350Text description) {
		this.description = description;
		return this;
	}
}