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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InterestPaymentDateRange1;
import com.tools20022.repository.msg.InterestPaymentDateRange2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between expected/due interest payment date and a interest payment
 * schedule per amount and due date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestPaymentSchedule1Choice#mmDateRange
 * InterestPaymentSchedule1Choice.mmDateRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestPaymentSchedule1Choice#mmSubSchedule
 * InterestPaymentSchedule1Choice.mmSubSchedule}</li>
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
 * "InterestPaymentSchedule1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between expected/due interest payment date and a interest payment schedule per amount and due date."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InterestPaymentSchedule1Choice", propOrder = {"dateRange", "subSchedule"})
public class InterestPaymentSchedule1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtRg", required = true)
	protected InterestPaymentDateRange1 dateRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange1
	 * InterestPaymentDateRange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InterestPaymentSchedule1Choice
	 * InterestPaymentSchedule1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an expected date and a due date for the interest payment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InterestPaymentSchedule1Choice, InterestPaymentDateRange1> mmDateRange = new MMMessageAssociationEnd<InterestPaymentSchedule1Choice, InterestPaymentDateRange1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.InterestPaymentSchedule1Choice.mmObject();
			isDerived = false;
			xmlTag = "DtRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateRange";
			definition = "Specifies an expected date and a due date for the interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InterestPaymentDateRange1.mmObject();
		}

		@Override
		public InterestPaymentDateRange1 getValue(InterestPaymentSchedule1Choice obj) {
			return obj.getDateRange();
		}

		@Override
		public void setValue(InterestPaymentSchedule1Choice obj, InterestPaymentDateRange1 value) {
			obj.setDateRange(value);
		}
	};
	@XmlElement(name = "SubSchdl", required = true)
	protected List<InterestPaymentDateRange2> subSchedule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InterestPaymentDateRange2
	 * InterestPaymentDateRange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InterestPaymentSchedule1Choice
	 * InterestPaymentSchedule1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubSchdl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an interest payment schedule, that is an interest amount that must be paid no sooner than the expected payment date and no later than the due date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InterestPaymentSchedule1Choice, List<InterestPaymentDateRange2>> mmSubSchedule = new MMMessageAssociationEnd<InterestPaymentSchedule1Choice, List<InterestPaymentDateRange2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.InterestPaymentSchedule1Choice.mmObject();
			isDerived = false;
			xmlTag = "SubSchdl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubSchedule";
			definition = "Specifies an interest payment schedule, that is an interest amount that must be paid no sooner than the expected payment date and no later than the due date.";
			minOccurs = 2;
			isComposite = true;
			type_lazy = () -> InterestPaymentDateRange2.mmObject();
		}

		@Override
		public List<InterestPaymentDateRange2> getValue(InterestPaymentSchedule1Choice obj) {
			return obj.getSubSchedule();
		}

		@Override
		public void setValue(InterestPaymentSchedule1Choice obj, List<InterestPaymentDateRange2> value) {
			obj.setSubSchedule(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InterestPaymentSchedule1Choice.mmDateRange, com.tools20022.repository.choice.InterestPaymentSchedule1Choice.mmSubSchedule);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestPaymentSchedule1Choice";
				definition = "Choice between expected/due interest payment date and a interest payment schedule per amount and due date.";
			}
		});
		return mmObject_lazy.get();
	}

	public InterestPaymentDateRange1 getDateRange() {
		return dateRange;
	}

	public InterestPaymentSchedule1Choice setDateRange(InterestPaymentDateRange1 dateRange) {
		this.dateRange = Objects.requireNonNull(dateRange);
		return this;
	}

	public List<InterestPaymentDateRange2> getSubSchedule() {
		return subSchedule == null ? subSchedule = new ArrayList<>() : subSchedule;
	}

	public InterestPaymentSchedule1Choice setSubSchedule(List<InterestPaymentDateRange2> subSchedule) {
		this.subSchedule = Objects.requireNonNull(subSchedule);
		return this;
	}
}