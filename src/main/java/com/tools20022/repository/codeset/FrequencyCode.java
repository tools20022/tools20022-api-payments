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
import com.tools20022.repository.codeset.FrequencyCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#Annual
 * FrequencyCode.mmAnnual}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#Monthly
 * FrequencyCode.mmMonthly}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#Quarterly
 * FrequencyCode.mmQuarterly}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#SemiAnnual
 * FrequencyCode.mmSemiAnnual}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#Weekly
 * FrequencyCode.mmWeekly}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#Daily
 * FrequencyCode.mmDaily}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#Adhoc
 * FrequencyCode.mmAdhoc}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#IntraDay
 * FrequencyCode.mmIntraDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#Overnight
 * FrequencyCode.mmOvernight}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#TenDays
 * FrequencyCode.mmTenDays}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#Fortnightly
 * FrequencyCode.mmFortnightly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyCode#TriggeredByMovement
 * FrequencyCode.mmTriggeredByMovement}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#Never
 * FrequencyCode.mmNever}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FrequencyCode#Rate
 * FrequencyCode.mmRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Frequency7Code
 * Frequency7Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Frequency6Code
 * Frequency6Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Frequency10Code
 * Frequency10Code}</li>
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
 * "FrequencyCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the regularity of an event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FrequencyCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event takes place every year or once a year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
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
	public static final FrequencyCode Annual = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Annual";
			definition = "Event takes place every year or once a year.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "YEAR";
		}
	};
	/**
	 * Event takes place every month or once a month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
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
	public static final FrequencyCode Monthly = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Monthly";
			definition = "Event takes place every month or once a month.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "MNTH";
		}
	};
	/**
	 * Event takes place every three months or four times a year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QURT"</li>
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
	public static final FrequencyCode Quarterly = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quarterly";
			definition = "Event takes place every three months or four times a year.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "QURT";
		}
	};
	/**
	 * Event takes place every six months or two times a year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIAN"</li>
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
	public static final FrequencyCode SemiAnnual = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SemiAnnual";
			definition = "Event takes place every six months or two times a year.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "MIAN";
		}
	};
	/**
	 * Event takes place once a week.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
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
	public static final FrequencyCode Weekly = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Weekly";
			definition = "Event takes place once a week.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "WEEK";
		}
	};
	/**
	 * Event takes place every day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
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
	public static final FrequencyCode Daily = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Daily";
			definition = "Event takes place every day.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "DAIL";
		}
	};
	/**
	 * Event takes place on request or as necessary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
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
	 * definition} = "Event takes place on request or as necessary."</li>
	 * </ul>
	 */
	public static final FrequencyCode Adhoc = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adhoc";
			definition = "Event takes place on request or as necessary.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "ADHO";
		}
	};
	/**
	 * Event takes place several times a day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
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
	public static final FrequencyCode IntraDay = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntraDay";
			definition = "Event takes place several times a day.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "INDA";
		}
	};
	/**
	 * Event takes place overnight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
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
	public static final FrequencyCode Overnight = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Overnight";
			definition = "Event takes place overnight.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "OVNG";
		}
	};
	/**
	 * Event takes place every ten business days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every ten business days."</li>
	 * </ul>
	 */
	public static final FrequencyCode TenDays = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TenDays";
			definition = "Event takes place every ten business days.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "TEND";
		}
	};
	/**
	 * Event takes place every two weeks.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fortnightly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every two weeks."</li>
	 * </ul>
	 */
	public static final FrequencyCode Fortnightly = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fortnightly";
			definition = "Event takes place every two weeks.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "FRTN";
		}
	};
	/**
	 * Event takes place at the end of the day if there was a movement on the
	 * account, otherwise nothing is sent that day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TriggeredByMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event takes place at the end of the day if there was a movement on the account, otherwise nothing is sent that day. "
	 * </li>
	 * </ul>
	 */
	public static final FrequencyCode TriggeredByMovement = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TriggeredByMovement";
			definition = "Event takes place at the end of the day if there was a movement on the account, otherwise nothing is sent that day. ";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "MOVE";
		}
	};
	/**
	 * Event does never take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Never"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event does never take place."</li>
	 * </ul>
	 */
	public static final FrequencyCode Never = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Never";
			definition = "Event does never take place.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "NEVR";
		}
	};
	/**
	 * Event takes place based on a change of a rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place based on a change of a rate."</li>
	 * </ul>
	 */
	public static final FrequencyCode Rate = new FrequencyCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Event takes place based on a change of a rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyCode.mmObject();
			codeName = "RATE";
		}
	};
	final static private LinkedHashMap<String, FrequencyCode> codesByName = new LinkedHashMap<>();

	protected FrequencyCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("YEAR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FrequencyCode";
				definition = "Specifies the regularity of an event.";
				derivation_lazy = () -> Arrays.asList(Frequency7Code.mmObject(), Frequency6Code.mmObject(), Frequency10Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FrequencyCode.Annual, com.tools20022.repository.codeset.FrequencyCode.Monthly, com.tools20022.repository.codeset.FrequencyCode.Quarterly,
						com.tools20022.repository.codeset.FrequencyCode.SemiAnnual, com.tools20022.repository.codeset.FrequencyCode.Weekly, com.tools20022.repository.codeset.FrequencyCode.Daily,
						com.tools20022.repository.codeset.FrequencyCode.Adhoc, com.tools20022.repository.codeset.FrequencyCode.IntraDay, com.tools20022.repository.codeset.FrequencyCode.Overnight,
						com.tools20022.repository.codeset.FrequencyCode.TenDays, com.tools20022.repository.codeset.FrequencyCode.Fortnightly, com.tools20022.repository.codeset.FrequencyCode.TriggeredByMovement,
						com.tools20022.repository.codeset.FrequencyCode.Never, com.tools20022.repository.codeset.FrequencyCode.Rate);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Annual.getCodeName().get(), Annual);
		codesByName.put(Monthly.getCodeName().get(), Monthly);
		codesByName.put(Quarterly.getCodeName().get(), Quarterly);
		codesByName.put(SemiAnnual.getCodeName().get(), SemiAnnual);
		codesByName.put(Weekly.getCodeName().get(), Weekly);
		codesByName.put(Daily.getCodeName().get(), Daily);
		codesByName.put(Adhoc.getCodeName().get(), Adhoc);
		codesByName.put(IntraDay.getCodeName().get(), IntraDay);
		codesByName.put(Overnight.getCodeName().get(), Overnight);
		codesByName.put(TenDays.getCodeName().get(), TenDays);
		codesByName.put(Fortnightly.getCodeName().get(), Fortnightly);
		codesByName.put(TriggeredByMovement.getCodeName().get(), TriggeredByMovement);
		codesByName.put(Never.getCodeName().get(), Never);
		codesByName.put(Rate.getCodeName().get(), Rate);
	}

	public static FrequencyCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FrequencyCode[] values() {
		FrequencyCode[] values = new FrequencyCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FrequencyCode> {
		@Override
		public FrequencyCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FrequencyCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}