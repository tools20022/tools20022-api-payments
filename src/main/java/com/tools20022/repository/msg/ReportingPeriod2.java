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
import com.tools20022.repository.codeset.QueryType3Code;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DatePeriodDetails1;
import com.tools20022.repository.msg.TimePeriodDetails1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the requested reporting period.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingPeriod2#mmFromToDate
 * ReportingPeriod2.mmFromToDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingPeriod2#mmFromToTime
 * ReportingPeriod2.mmFromToTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingPeriod2#mmType
 * ReportingPeriod2.mmType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
 * DateTimePeriod}</li>
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
 * "ReportingPeriod2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the requested reporting period."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ReportingPeriod1 ReportingPeriod1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportingPeriod2", propOrder = {"fromToDate", "fromToTime", "type"})
public class ReportingPeriod2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FrToDt", required = true)
	protected DatePeriodDetails1 fromToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails1
	 * DatePeriodDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod2
	 * ReportingPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a date range."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod1#mmFromToDate
	 * ReportingPeriod1.mmFromToDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportingPeriod2, DatePeriodDetails1> mmFromToDate = new MMMessageAttribute<ReportingPeriod2, DatePeriodDetails1>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingPeriod2.mmObject();
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Specifies a date range.";
			previousVersion_lazy = () -> ReportingPeriod1.mmFromToDate;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DatePeriodDetails1.mmObject();
		}

		@Override
		public DatePeriodDetails1 getValue(ReportingPeriod2 obj) {
			return obj.getFromToDate();
		}

		@Override
		public void setValue(ReportingPeriod2 obj, DatePeriodDetails1 value) {
			obj.setFromToDate(value);
		}
	};
	@XmlElement(name = "FrToTm")
	protected TimePeriodDetails1 fromToTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TimePeriodDetails1
	 * TimePeriodDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod2
	 * ReportingPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a time range."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod1#mmFromToTime
	 * ReportingPeriod1.mmFromToTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportingPeriod2, Optional<TimePeriodDetails1>> mmFromToTime = new MMMessageAttribute<ReportingPeriod2, Optional<TimePeriodDetails1>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingPeriod2.mmObject();
			isDerived = false;
			xmlTag = "FrToTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToTime";
			definition = "Specifies a time range.";
			previousVersion_lazy = () -> ReportingPeriod1.mmFromToTime;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TimePeriodDetails1.mmObject();
		}

		@Override
		public Optional<TimePeriodDetails1> getValue(ReportingPeriod2 obj) {
			return obj.getFromToTime();
		}

		@Override
		public void setValue(ReportingPeriod2 obj, Optional<TimePeriodDetails1> value) {
			obj.setFromToTime(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected QueryType3Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QueryType3Code
	 * QueryType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod2
	 * ReportingPeriod2}</li>
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
	 * definition} =
	 * "Specifies whether all matching items need to be reported or only those items that are new or have changed since the last similar request was made."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReportingPeriod1#mmType
	 * ReportingPeriod1.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportingPeriod2, QueryType3Code> mmType = new MMMessageAttribute<ReportingPeriod2, QueryType3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReportingPeriod2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies whether all matching items need to be reported or only those items that are new or have changed since the last similar request was made.";
			previousVersion_lazy = () -> ReportingPeriod1.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QueryType3Code.mmObject();
		}

		@Override
		public QueryType3Code getValue(ReportingPeriod2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(ReportingPeriod2 obj, QueryType3Code value) {
			obj.setType(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReportingPeriod2.mmFromToDate, com.tools20022.repository.msg.ReportingPeriod2.mmFromToTime, com.tools20022.repository.msg.ReportingPeriod2.mmType);
				trace_lazy = () -> DateTimePeriod.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingPeriod2";
				definition = "Specifies the requested reporting period.";
				previousVersion_lazy = () -> ReportingPeriod1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DatePeriodDetails1 getFromToDate() {
		return fromToDate;
	}

	public ReportingPeriod2 setFromToDate(DatePeriodDetails1 fromToDate) {
		this.fromToDate = Objects.requireNonNull(fromToDate);
		return this;
	}

	public Optional<TimePeriodDetails1> getFromToTime() {
		return fromToTime == null ? Optional.empty() : Optional.of(fromToTime);
	}

	public ReportingPeriod2 setFromToTime(TimePeriodDetails1 fromToTime) {
		this.fromToTime = fromToTime;
		return this;
	}

	public QueryType3Code getType() {
		return type;
	}

	public ReportingPeriod2 setType(QueryType3Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}
}