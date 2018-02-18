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
import com.tools20022.repository.codeset.MarginCallResponseCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the margin call request was sent on a non valuation day or
 * was received after notification time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginCallResponseCode#NonValuationDay
 * MarginCallResponseCode.NonValuationDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarginCallResponseCode#ReceivedAfterNotificationTime
 * MarginCallResponseCode.ReceivedAfterNotificationTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NVDA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCallResponseCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the margin call request was sent on a non valuation day or was received after notification time."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MarginCallResponseCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the margin call request was sent on a non valuation day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginCallResponseCode
	 * MarginCallResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NVDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonValuationDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the margin call request was sent on a non valuation day."
	 * </li>
	 * </ul>
	 */
	public static final MarginCallResponseCode NonValuationDay = new MarginCallResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonValuationDay";
			definition = "Indicates that the margin call request was sent on a non valuation day.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginCallResponseCode.mmObject();
			codeName = "NVDA";
		}
	};
	/**
	 * Indicates that the margin call request was sent after the notification
	 * time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarginCallResponseCode
	 * MarginCallResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RANT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedAfterNotificationTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the margin call request was sent after the notification time."
	 * </li>
	 * </ul>
	 */
	public static final MarginCallResponseCode ReceivedAfterNotificationTime = new MarginCallResponseCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedAfterNotificationTime";
			definition = "Indicates that the margin call request was sent after the notification time.";
			owner_lazy = () -> com.tools20022.repository.codeset.MarginCallResponseCode.mmObject();
			codeName = "RANT";
		}
	};
	final static private LinkedHashMap<String, MarginCallResponseCode> codesByName = new LinkedHashMap<>();

	protected MarginCallResponseCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NVDA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCallResponseCode";
				definition = "Specifies whether the margin call request was sent on a non valuation day or was received after notification time.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarginCallResponseCode.NonValuationDay, com.tools20022.repository.codeset.MarginCallResponseCode.ReceivedAfterNotificationTime);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NonValuationDay.getCodeName().get(), NonValuationDay);
		codesByName.put(ReceivedAfterNotificationTime.getCodeName().get(), ReceivedAfterNotificationTime);
	}

	public static MarginCallResponseCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MarginCallResponseCode[] values() {
		MarginCallResponseCode[] values = new MarginCallResponseCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MarginCallResponseCode> {
		@Override
		public MarginCallResponseCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MarginCallResponseCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}