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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Distribution;
import com.tools20022.repository.entity.Meeting;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Cash premium made available if the securities holder consents or participates
 * to an event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IncentivePremium" src="doc-files/IncentivePremium.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPerSecurity
 * IncentivePremium.mmPerSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IncentivePremium#mmPerVote
 * IncentivePremium.mmPerVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPerAttendee
 * IncentivePremium.mmPerAttendee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmDescription
 * IncentivePremium.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPremiumAmount
 * IncentivePremium.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmPaymentDate
 * IncentivePremium.mmPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IncentivePremium#mmMeeting
 * IncentivePremium.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IncentivePremium#mmCorporateActionDistribution
 * IncentivePremium.mmCorporateActionDistribution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmIncentivePremium
 * Meeting.mmIncentivePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmIncentivePremium
 * Distribution.mmIncentivePremium}</li>
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
 * "IncentivePremium"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash premium made available if the securities holder consents or participates to an event."
 * </li>
 * </ul>
 */
public class IncentivePremium {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Number perSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of securities giving right to a premium."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IncentivePremium, Number> mmPerSecurity = new MMBusinessAttribute<IncentivePremium, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerSecurity";
			definition = "Number of securities giving right to a premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(IncentivePremium obj) {
			return obj.getPerSecurity();
		}

		@Override
		public void setValue(IncentivePremium obj, Number value) {
			obj.setPerSecurity(value);
		}
	};
	protected Number perVote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerVote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes giving right to a premium."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IncentivePremium, Number> mmPerVote = new MMBusinessAttribute<IncentivePremium, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerVote";
			definition = "Number of votes giving right to a premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(IncentivePremium obj) {
			return obj.getPerVote();
		}

		@Override
		public void setValue(IncentivePremium obj, Number value) {
			obj.setPerVote(value);
		}
	};
	protected YesNoIndicator perAttendee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerAttendee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the premium is given per attendee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IncentivePremium, YesNoIndicator> mmPerAttendee = new MMBusinessAttribute<IncentivePremium, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerAttendee";
			definition = "Indicates that the premium is given per attendee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(IncentivePremium obj) {
			return obj.getPerAttendee();
		}

		@Override
		public void setValue(IncentivePremium obj, YesNoIndicator value) {
			obj.setPerAttendee(value);
		}
	};
	protected Max350Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the premium."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IncentivePremium, Max350Text> mmDescription = new MMBusinessAttribute<IncentivePremium, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Description";
			definition = "Description of the premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(IncentivePremium obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(IncentivePremium obj, Max350Text value) {
			obj.setDescription(value);
		}
	};
	protected CurrencyAndAmount premiumAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash premium paid per security, per vote or per attendee."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IncentivePremium, CurrencyAndAmount> mmPremiumAmount = new MMBusinessAttribute<IncentivePremium, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PremiumAmount";
			definition = "Cash premium paid per security, per vote or per attendee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(IncentivePremium obj) {
			return obj.getPremiumAmount();
		}

		@Override
		public void setValue(IncentivePremium obj, CurrencyAndAmount value) {
			obj.setPremiumAmount(value);
		}
	};
	protected ISODateTime paymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time for the payment of the premium."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<IncentivePremium, ISODateTime> mmPaymentDate = new MMBusinessAttribute<IncentivePremium, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date/time for the payment of the premium.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(IncentivePremium obj) {
			return obj.getPaymentDate();
		}

		@Override
		public void setValue(IncentivePremium obj, ISODateTime value) {
			obj.setPaymentDate(value);
		}
	};
	protected Meeting meeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmIncentivePremium
	 * Meeting.mmIncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which an incentive premium is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<IncentivePremium, Meeting> mmMeeting = new MMBusinessAssociationEnd<IncentivePremium, Meeting>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which an incentive premium is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Meeting.mmIncentivePremium;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Meeting.mmObject();
		}

		@Override
		public Meeting getValue(IncentivePremium obj) {
			return obj.getMeeting();
		}

		@Override
		public void setValue(IncentivePremium obj, Meeting value) {
			obj.setMeeting(value);
		}
	};
	protected Distribution corporateActionDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmIncentivePremium
	 * Distribution.mmIncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IncentivePremium
	 * IncentivePremium}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CorporateActionDistribution for which an incentive premium is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<IncentivePremium, Distribution> mmCorporateActionDistribution = new MMBusinessAssociationEnd<IncentivePremium, Distribution>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IncentivePremium.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "CorporateActionDistribution for which an incentive premium is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Distribution.mmIncentivePremium;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Distribution.mmObject();
		}

		@Override
		public Distribution getValue(IncentivePremium obj) {
			return obj.getCorporateActionDistribution();
		}

		@Override
		public void setValue(IncentivePremium obj, Distribution value) {
			obj.setCorporateActionDistribution(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IncentivePremium";
				definition = "Cash premium made available if the securities holder consents or participates to an event.";
				associationDomain_lazy = () -> Arrays.asList(Meeting.mmIncentivePremium, Distribution.mmIncentivePremium);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IncentivePremium.mmPerSecurity, com.tools20022.repository.entity.IncentivePremium.mmPerVote,
						com.tools20022.repository.entity.IncentivePremium.mmPerAttendee, com.tools20022.repository.entity.IncentivePremium.mmDescription, com.tools20022.repository.entity.IncentivePremium.mmPremiumAmount,
						com.tools20022.repository.entity.IncentivePremium.mmPaymentDate, com.tools20022.repository.entity.IncentivePremium.mmMeeting, com.tools20022.repository.entity.IncentivePremium.mmCorporateActionDistribution);
			}

			@Override
			public Class<?> getInstanceClass() {
				return IncentivePremium.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Number getPerSecurity() {
		return perSecurity;
	}

	public IncentivePremium setPerSecurity(Number perSecurity) {
		this.perSecurity = Objects.requireNonNull(perSecurity);
		return this;
	}

	public Number getPerVote() {
		return perVote;
	}

	public IncentivePremium setPerVote(Number perVote) {
		this.perVote = Objects.requireNonNull(perVote);
		return this;
	}

	public YesNoIndicator getPerAttendee() {
		return perAttendee;
	}

	public IncentivePremium setPerAttendee(YesNoIndicator perAttendee) {
		this.perAttendee = Objects.requireNonNull(perAttendee);
		return this;
	}

	public Max350Text getDescription() {
		return description;
	}

	public IncentivePremium setDescription(Max350Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public CurrencyAndAmount getPremiumAmount() {
		return premiumAmount;
	}

	public IncentivePremium setPremiumAmount(CurrencyAndAmount premiumAmount) {
		this.premiumAmount = Objects.requireNonNull(premiumAmount);
		return this;
	}

	public ISODateTime getPaymentDate() {
		return paymentDate;
	}

	public IncentivePremium setPaymentDate(ISODateTime paymentDate) {
		this.paymentDate = Objects.requireNonNull(paymentDate);
		return this;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public IncentivePremium setMeeting(Meeting meeting) {
		this.meeting = Objects.requireNonNull(meeting);
		return this;
	}

	public Distribution getCorporateActionDistribution() {
		return corporateActionDistribution;
	}

	public IncentivePremium setCorporateActionDistribution(Distribution corporateActionDistribution) {
		this.corporateActionDistribution = Objects.requireNonNull(corporateActionDistribution);
		return this;
	}
}