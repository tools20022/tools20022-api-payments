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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the number of voting rights and of outstanding securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingParticipation" src="doc-files/MeetingParticipation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmTotalNumberOfSecuritiesOutstanding
 * MeetingParticipation.mmTotalNumberOfSecuritiesOutstanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmTotalNumberOfVotingRights
 * MeetingParticipation.mmTotalNumberOfVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmCalculationDate
 * MeetingParticipation.mmCalculationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmTotalNumberOfSecurities
 * MeetingParticipation.mmTotalNumberOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmMeeting
 * MeetingParticipation.mmMeeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmParticipation
 * Meeting.mmParticipation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingParticipation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the number of voting rights and of outstanding securities."</li>
 * </ul>
 */
public class MeetingParticipation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount totalNumberOfSecuritiesOutstanding;
	/**
	 * Number of securities admitted to the vote, expressed as an amount and a
	 * currency.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation
	 * MeetingParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfSecuritiesOutstanding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of securities admitted to the vote, expressed as an amount and a currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalNumberOfSecuritiesOutstanding = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingParticipation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfSecuritiesOutstanding";
			definition = "Number of securities admitted to the vote, expressed as an amount and a currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingParticipation.class.getMethod("getTotalNumberOfSecuritiesOutstanding", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number totalNumberOfVotingRights;
	/**
	 * Number of rights admitted to the vote.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation
	 * MeetingParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfVotingRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of rights admitted to the vote."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalNumberOfVotingRights = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingParticipation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfVotingRights";
			definition = "Number of rights admitted to the vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingParticipation.class.getMethod("getTotalNumberOfVotingRights", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate calculationDate;
	/**
	 * Date of calculation of the total number of oustanding securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation
	 * MeetingParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of calculation of the total number of oustanding securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingParticipation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date of calculation of the total number of oustanding securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingParticipation.class.getMethod("getCalculationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number totalNumberOfSecurities;
	/**
	 * Number of securities admitted to the vote, expressed as a number of
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation
	 * MeetingParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of securities admitted to the vote, expressed as a number of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalNumberOfSecurities = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingParticipation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalNumberOfSecurities";
			definition = "Number of securities admitted to the vote, expressed as a number of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingParticipation.class.getMethod("getTotalNumberOfSecurities", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Meeting meeting;
	/**
	 * Meeting for which participation conditions are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmParticipation
	 * Meeting.mmParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation
	 * MeetingParticipation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which participation conditions are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingParticipation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which participation conditions are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmParticipation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingParticipation";
				definition = "Specifies the number of voting rights and of outstanding securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.mmParticipation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingParticipation.mmTotalNumberOfSecuritiesOutstanding, com.tools20022.repository.entity.MeetingParticipation.mmTotalNumberOfVotingRights,
						com.tools20022.repository.entity.MeetingParticipation.mmCalculationDate, com.tools20022.repository.entity.MeetingParticipation.mmTotalNumberOfSecurities,
						com.tools20022.repository.entity.MeetingParticipation.mmMeeting);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingParticipation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getTotalNumberOfSecuritiesOutstanding() {
		return totalNumberOfSecuritiesOutstanding;
	}

	public void setTotalNumberOfSecuritiesOutstanding(CurrencyAndAmount totalNumberOfSecuritiesOutstanding) {
		this.totalNumberOfSecuritiesOutstanding = totalNumberOfSecuritiesOutstanding;
	}

	public Number getTotalNumberOfVotingRights() {
		return totalNumberOfVotingRights;
	}

	public void setTotalNumberOfVotingRights(Number totalNumberOfVotingRights) {
		this.totalNumberOfVotingRights = totalNumberOfVotingRights;
	}

	public ISODate getCalculationDate() {
		return calculationDate;
	}

	public void setCalculationDate(ISODate calculationDate) {
		this.calculationDate = calculationDate;
	}

	public Number getTotalNumberOfSecurities() {
		return totalNumberOfSecurities;
	}

	public void setTotalNumberOfSecurities(Number totalNumberOfSecurities) {
		this.totalNumberOfSecurities = totalNumberOfSecurities;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(com.tools20022.repository.entity.Meeting meeting) {
		this.meeting = meeting;
	}
}