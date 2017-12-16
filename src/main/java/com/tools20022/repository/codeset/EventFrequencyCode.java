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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.EventFrequencyCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the regularity of an event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequencyCode#Annual
 * EventFrequencyCode.mmAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode#SemiAnnual
 * EventFrequencyCode.mmSemiAnnual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode#Quarterly
 * EventFrequencyCode.mmQuarterly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode#EveryTwoMonths
 * EventFrequencyCode.mmEveryTwoMonths}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequencyCode#Monthly
 * EventFrequencyCode.mmMonthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode#TwiceAMonth
 * EventFrequencyCode.mmTwiceAMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode#EveryTwoWeeks
 * EventFrequencyCode.mmEveryTwoWeeks}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequencyCode#Weekly
 * EventFrequencyCode.mmWeekly}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequencyCode#Daily
 * EventFrequencyCode.mmDaily}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode#IntraDay
 * EventFrequencyCode.mmIntraDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode#Overnight
 * EventFrequencyCode.mmOvernight}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequencyCode#Adhoc
 * EventFrequencyCode.mmAdhoc}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode#OnDemand
 * EventFrequencyCode.mmOnDemand}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequencyCode#Closed
 * EventFrequencyCode.mmClosed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode#EveryFourMonths
 * EventFrequencyCode.mmEveryFourMonths}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode#EveryTwoYears
 * EventFrequencyCode.mmEveryTwoYears}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.EventFrequencyCode#None
 * EventFrequencyCode.mmNone}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"YEAR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EventFrequencyCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the regularity of an event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EventFrequencyCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event takes place every year or once a year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YEAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every year or once a year."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode Annual = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Annual";
			definition = "Event takes place every year or once a year.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "YEAR";
		}
	};
	/**
	 * Event takes place every six months or two times a year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiAnnual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every six months or two times a year."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode SemiAnnual = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SemiAnnual";
			definition = "Event takes place every six months or two times a year.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "SEMI";
		}
	};
	/**
	 * Event takes place every three months or four times a year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quarterly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event takes place every three months or four times a year."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode Quarterly = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quarterly";
			definition = "Event takes place every three months or four times a year.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "QUTR";
		}
	};
	/**
	 * Event takes place every two months.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOMN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryTwoMonths"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every two months."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode EveryTwoMonths = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EveryTwoMonths";
			definition = "Event takes place every two months.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "TOMN";
		}
	};
	/**
	 * Event takes place every month or once a month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monthly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every month or once a month."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode Monthly = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Monthly";
			definition = "Event takes place every month or once a month.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "MNTH";
		}
	};
	/**
	 * Event takes place two times a month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TWMN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwiceAMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place two times a month."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode TwiceAMonth = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TwiceAMonth";
			definition = "Event takes place two times a month.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "TWMN";
		}
	};
	/**
	 * Event takes place every two weeks.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOWK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryTwoWeeks"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every two weeks."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode EveryTwoWeeks = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EveryTwoWeeks";
			definition = "Event takes place every two weeks.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "TOWK";
		}
	};
	/**
	 * Event takes place once a week.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WEEK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place once a week."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode Weekly = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Weekly";
			definition = "Event takes place once a week.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "WEEK";
		}
	};
	/**
	 * Event takes place every day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Daily"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every day."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode Daily = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Daily";
			definition = "Event takes place every day.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "DAIL";
		}
	};
	/**
	 * Event takes place several times a day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place several times a day."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode IntraDay = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntraDay";
			definition = "Event takes place several times a day.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "INDA";
		}
	};
	/**
	 * Event takes place overnight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overnight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place overnight."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode Overnight = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Overnight";
			definition = "Event takes place overnight.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "OVNG";
		}
	};
	/**
	 * Event takes place as necessary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adhoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place as necessary."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode Adhoc = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adhoc";
			definition = "Event takes place as necessary.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "ADHO";
		}
	};
	/**
	 * Event takes place on demand.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnDemand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place on demand."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode OnDemand = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnDemand";
			definition = "Event takes place on demand.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "ONDE";
		}
	};
	/**
	 * Event cannot take place, because, for example, the fund is closed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event cannot take place, because, for example, the fund is closed."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode Closed = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Closed";
			definition = "Event cannot take place, because, for example, the fund is closed.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Event takes place every four months or three times a year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FOMN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryFourMonths"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event takes place every four months or three times a year."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode EveryFourMonths = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryFourMonths";
			definition = "Event takes place every four months or three times a year.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "FOMN";
		}
	};
	/**
	 * Event takes place every two years.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TYEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EveryTwoYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every two years."</li>
	 * </ul>
	 */
	public static final EventFrequencyCode EveryTwoYears = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EveryTwoYears";
			definition = "Event takes place every two years.";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "TYEA";
		}
	};
	/**
	 * Event does not take place
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event does not take place"</li>
	 * </ul>
	 */
	public static final EventFrequencyCode None = new EventFrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			definition = "Event does not take place";
			owner_lazy = () -> com.tools20022.repository.codeset.EventFrequencyCode.mmObject();
			codeName = "NONE";
		}
	};
	final static private LinkedHashMap<String, EventFrequencyCode> codesByName = new LinkedHashMap<>();

	protected EventFrequencyCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("YEAR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventFrequencyCode";
				definition = "Specifies the regularity of an event.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventFrequencyCode.Annual, com.tools20022.repository.codeset.EventFrequencyCode.SemiAnnual, com.tools20022.repository.codeset.EventFrequencyCode.Quarterly,
						com.tools20022.repository.codeset.EventFrequencyCode.EveryTwoMonths, com.tools20022.repository.codeset.EventFrequencyCode.Monthly, com.tools20022.repository.codeset.EventFrequencyCode.TwiceAMonth,
						com.tools20022.repository.codeset.EventFrequencyCode.EveryTwoWeeks, com.tools20022.repository.codeset.EventFrequencyCode.Weekly, com.tools20022.repository.codeset.EventFrequencyCode.Daily,
						com.tools20022.repository.codeset.EventFrequencyCode.IntraDay, com.tools20022.repository.codeset.EventFrequencyCode.Overnight, com.tools20022.repository.codeset.EventFrequencyCode.Adhoc,
						com.tools20022.repository.codeset.EventFrequencyCode.OnDemand, com.tools20022.repository.codeset.EventFrequencyCode.Closed, com.tools20022.repository.codeset.EventFrequencyCode.EveryFourMonths,
						com.tools20022.repository.codeset.EventFrequencyCode.EveryTwoYears, com.tools20022.repository.codeset.EventFrequencyCode.None);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Annual.getCodeName().get(), Annual);
		codesByName.put(SemiAnnual.getCodeName().get(), SemiAnnual);
		codesByName.put(Quarterly.getCodeName().get(), Quarterly);
		codesByName.put(EveryTwoMonths.getCodeName().get(), EveryTwoMonths);
		codesByName.put(Monthly.getCodeName().get(), Monthly);
		codesByName.put(TwiceAMonth.getCodeName().get(), TwiceAMonth);
		codesByName.put(EveryTwoWeeks.getCodeName().get(), EveryTwoWeeks);
		codesByName.put(Weekly.getCodeName().get(), Weekly);
		codesByName.put(Daily.getCodeName().get(), Daily);
		codesByName.put(IntraDay.getCodeName().get(), IntraDay);
		codesByName.put(Overnight.getCodeName().get(), Overnight);
		codesByName.put(Adhoc.getCodeName().get(), Adhoc);
		codesByName.put(OnDemand.getCodeName().get(), OnDemand);
		codesByName.put(Closed.getCodeName().get(), Closed);
		codesByName.put(EveryFourMonths.getCodeName().get(), EveryFourMonths);
		codesByName.put(EveryTwoYears.getCodeName().get(), EveryTwoYears);
		codesByName.put(None.getCodeName().get(), None);
	}

	public static EventFrequencyCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EventFrequencyCode[] values() {
		EventFrequencyCode[] values = new EventFrequencyCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EventFrequencyCode> {
		@Override
		public EventFrequencyCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EventFrequencyCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}