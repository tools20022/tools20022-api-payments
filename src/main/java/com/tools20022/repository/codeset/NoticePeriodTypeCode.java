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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of notice period.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode#mmBankWorkingDay
 * NoticePeriodTypeCode.mmBankWorkingDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode#mmCalendarDay
 * NoticePeriodTypeCode.mmCalendarDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode#mmMonth
 * NoticePeriodTypeCode.mmMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode#mmWeek
 * NoticePeriodTypeCode.mmWeek}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode#mmWorkingDay
 * NoticePeriodTypeCode.mmWorkingDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode#mmYear
 * NoticePeriodTypeCode.mmYear}</li>
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
 * <li>"BKWD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NoticePeriodTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of notice period."</li>
 * </ul>
 */
public class NoticePeriodTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The notice period is expressed in banking working days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode
	 * NoticePeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKWD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankWorkingDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The notice period is expressed in banking working days."</li>
	 * </ul>
	 */
	public static final MMCode mmBankWorkingDay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankWorkingDay";
			definition = "The notice period is expressed in banking working days.";
			owner_lazy = () -> NoticePeriodTypeCode.mmObject();
			codeName = "BKWD";
		}
	};
	/**
	 * The notice period is expressed in calendar days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode
	 * NoticePeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAYC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalendarDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The notice period is expressed in calendar days."</li>
	 * </ul>
	 */
	public static final MMCode mmCalendarDay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalendarDay";
			definition = "The notice period is expressed in calendar days.";
			owner_lazy = () -> NoticePeriodTypeCode.mmObject();
			codeName = "DAYC";
		}
	};
	/**
	 * The notice period is expressed in months.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode
	 * NoticePeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Month"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The notice period is expressed in months."</li>
	 * </ul>
	 */
	public static final MMCode mmMonth = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Month";
			definition = "The notice period is expressed in months.";
			owner_lazy = () -> NoticePeriodTypeCode.mmObject();
			codeName = "MNTH";
		}
	};
	/**
	 * The notice period is expressed in weeks.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode
	 * NoticePeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WEEK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Week"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The notice period is expressed in weeks."</li>
	 * </ul>
	 */
	public static final MMCode mmWeek = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Week";
			definition = "The notice period is expressed in weeks.";
			owner_lazy = () -> NoticePeriodTypeCode.mmObject();
			codeName = "WEEK";
		}
	};
	/**
	 * The notice period is expressed in working days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode
	 * NoticePeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WOKD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WorkingDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The notice period is expressed in working days."</li>
	 * </ul>
	 */
	public static final MMCode mmWorkingDay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WorkingDay";
			definition = "The notice period is expressed in working days.";
			owner_lazy = () -> NoticePeriodTypeCode.mmObject();
			codeName = "WOKD";
		}
	};
	/**
	 * The notice period is expressed in years.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode
	 * NoticePeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YEAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Year"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The notice period is expressed in years."</li>
	 * </ul>
	 */
	public static final MMCode mmYear = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Year";
			definition = "The notice period is expressed in years.";
			owner_lazy = () -> NoticePeriodTypeCode.mmObject();
			codeName = "YEAR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BKWD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NoticePeriodTypeCode";
				definition = "Specifies the type of notice period.";
				code_lazy = () -> Arrays.asList(NoticePeriodTypeCode.mmBankWorkingDay, NoticePeriodTypeCode.mmCalendarDay, NoticePeriodTypeCode.mmMonth, NoticePeriodTypeCode.mmWeek, NoticePeriodTypeCode.mmWorkingDay,
						NoticePeriodTypeCode.mmYear);
			}
		});
		return mmObject_lazy.get();
	}
}