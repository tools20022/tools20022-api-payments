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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of either the last payment date or the number of payments to make.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EndPoint1Choice#mmNumberOfPayments
 * EndPoint1Choice.mmNumberOfPayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EndPoint1Choice#mmLastPaymentDate
 * EndPoint1Choice.mmLastPaymentDate}</li>
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
 * "EndPoint1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of either the last payment date or the number of payments to make. "</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EndPoint1Choice", propOrder = {"numberOfPayments", "lastPaymentDate"})
public class EndPoint1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NbOfPmts")
	protected Max35Text numberOfPayments;
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
	 * {@linkplain com.tools20022.repository.choice.EndPoint1Choice
	 * EndPoint1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfPmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EndPoint1Choice, Optional<Max35Text>> mmNumberOfPayments = new MMMessageAttribute<EndPoint1Choice, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.EndPoint1Choice.mmObject();
			isDerived = false;
			xmlTag = "NbOfPmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfPayments";
			definition = "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(EndPoint1Choice obj) {
			return obj.getNumberOfPayments();
		}

		@Override
		public void setValue(EndPoint1Choice obj, Optional<Max35Text> value) {
			obj.setNumberOfPayments(value.orElse(null));
		}
	};
	@XmlElement(name = "LastPmtDt")
	protected ISODate lastPaymentDate;
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
	 * {@linkplain com.tools20022.repository.choice.EndPoint1Choice
	 * EndPoint1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Final payment of the standing order due."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EndPoint1Choice, Optional<ISODate>> mmLastPaymentDate = new MMMessageAttribute<EndPoint1Choice, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.EndPoint1Choice.mmObject();
			isDerived = false;
			xmlTag = "LastPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastPaymentDate";
			definition = "Final payment of the standing order due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(EndPoint1Choice obj) {
			return obj.getLastPaymentDate();
		}

		@Override
		public void setValue(EndPoint1Choice obj, Optional<ISODate> value) {
			obj.setLastPaymentDate(value.orElse(null));
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.EndPoint1Choice.mmNumberOfPayments, com.tools20022.repository.choice.EndPoint1Choice.mmLastPaymentDate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EndPoint1Choice";
				definition = "Choice of either the last payment date or the number of payments to make. ";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getNumberOfPayments() {
		return numberOfPayments == null ? Optional.empty() : Optional.of(numberOfPayments);
	}

	public EndPoint1Choice setNumberOfPayments(Max35Text numberOfPayments) {
		this.numberOfPayments = numberOfPayments;
		return this;
	}

	public Optional<ISODate> getLastPaymentDate() {
		return lastPaymentDate == null ? Optional.empty() : Optional.of(lastPaymentDate);
	}

	public EndPoint1Choice setLastPaymentDate(ISODate lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
		return this;
	}
}