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

package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMTime;
import com.tools20022.repository.GeneratedRepository;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * A particular point in the progression of time in a calendar day expressed in
 * either UTC time format (hh:mm:ss.sssZ), local time with UTC offset format
 * (hh:mm:ss.sss+/-hh:mm), or local time format (hh:mm:ss.sss). These
 * representations are defined in
 * "XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004"
 * which is aligned with ISO 8601. Note on the time format: 1) beginning / end
 * of calendar day 00:00:00 = the beginning of a calendar day 24:00:00 = the end
 * of a calendar day 2) fractions of second in time format Decimal fractions of
 * seconds may be included. In this case, the involved parties shall agree on
 * the maximum number of digits that are allowed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * "ISOTime"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A particular point in the progression of time in a calendar day expressed in either UTC time format (hh:mm:ss.sssZ), local time with UTC offset format (hh:mm:ss.sss+/-hh:mm), or local time format (hh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.\nNote on the time format:\n1) beginning / end of calendar day\n00:00:00 = the beginning of a calendar day\n24:00:00 = the end of a calendar day\n2) fractions of second in time format\nDecimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType
public class ISOTime {

	final static private AtomicReference<MMTime> mmObject_lazy = new AtomicReference<>();
	@XmlValue
	protected Date value;

	final static public MMTime mmObject() {
		mmObject_lazy.compareAndSet(null, new MMTime() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ISOTime";
				definition = "A particular point in the progression of time in a calendar day expressed in either UTC time format (hh:mm:ss.sssZ), local time with UTC offset format (hh:mm:ss.sss+/-hh:mm), or local time format (hh:mm:ss.sss). These representations are defined in \"XML Schema Part 2: Datatypes Second Edition - W3C Recommendation 28 October 2004\" which is aligned with ISO 8601.\nNote on the time format:\n1) beginning / end of calendar day\n00:00:00 = the beginning of a calendar day\n24:00:00 = the end of a calendar day\n2) fractions of second in time format\nDecimal fractions of seconds may be included. In this case, the involved parties shall agree on the maximum number of digits that are allowed.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISOTime() {
	}

	public ISOTime(Date value) {
		this.value = value;
	}

	public Date getValue() {
		return value;
	}

	public void setValue(Date value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value == null ? null : value.toString();
	}
}