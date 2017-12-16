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
import com.tools20022.repository.codeset.DayBookingInstructionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Description of the nature of execution booking process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayBookingInstructionCode#Auto
 * DayBookingInstructionCode.mmAuto}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayBookingInstructionCode#SpeakFirst
 * DayBookingInstructionCode.mmSpeakFirst}</li>
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
 * <li>"AUTO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DayBookingInstructionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Description of the nature of execution booking process."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DayBookingInstructionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Can trigger booking without reference to the order initiator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayBookingInstructionCode
	 * DayBookingInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Auto"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Can trigger booking without reference to the order initiator."</li>
	 * </ul>
	 */
	public static final DayBookingInstructionCode Auto = new DayBookingInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Auto";
			definition = "Can trigger booking without reference to the order initiator.";
			owner_lazy = () -> com.tools20022.repository.codeset.DayBookingInstructionCode.mmObject();
			codeName = "AUTO";
		}
	};
	/**
	 * Speak with order initiator before booking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayBookingInstructionCode
	 * DayBookingInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TALK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpeakFirst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Speak with order initiator before booking."</li>
	 * </ul>
	 */
	public static final DayBookingInstructionCode SpeakFirst = new DayBookingInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpeakFirst";
			definition = "Speak with order initiator before booking.";
			owner_lazy = () -> com.tools20022.repository.codeset.DayBookingInstructionCode.mmObject();
			codeName = "TALK";
		}
	};
	final static private LinkedHashMap<String, DayBookingInstructionCode> codesByName = new LinkedHashMap<>();

	protected DayBookingInstructionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AUTO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DayBookingInstructionCode";
				definition = "Description of the nature of execution booking process.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DayBookingInstructionCode.Auto, com.tools20022.repository.codeset.DayBookingInstructionCode.SpeakFirst);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Auto.getCodeName().get(), Auto);
		codesByName.put(SpeakFirst.getCodeName().get(), SpeakFirst);
	}

	public static DayBookingInstructionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DayBookingInstructionCode[] values() {
		DayBookingInstructionCode[] values = new DayBookingInstructionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DayBookingInstructionCode> {
		@Override
		public DayBookingInstructionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DayBookingInstructionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}