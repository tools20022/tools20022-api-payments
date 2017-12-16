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
import com.tools20022.repository.codeset.OpeningClosingCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies additional information relative to the processing of the trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OpeningClosingCode#ClosePosition
 * OpeningClosingCode.mmClosePosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OpeningClosingCode#OpenPosition
 * OpeningClosingCode.mmOpenPosition}</li>
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
 * <li>"CLOP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OpeningClosingCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies additional information relative to the processing of the trade."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OpeningClosingCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the trade is to close a position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OpeningClosingCode
	 * OpeningClosingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosePosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the trade is to close a position."</li>
	 * </ul>
	 */
	public static final OpeningClosingCode ClosePosition = new OpeningClosingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosePosition";
			definition = "Indicates that the trade is to close a position.";
			owner_lazy = () -> com.tools20022.repository.codeset.OpeningClosingCode.mmObject();
			codeName = "CLOP";
		}
	};
	/**
	 * Indicates that the trade is to open a position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OpeningClosingCode
	 * OpeningClosingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the trade is to open a position."</li>
	 * </ul>
	 */
	public static final OpeningClosingCode OpenPosition = new OpeningClosingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpenPosition";
			definition = "Indicates that the trade is to open a position.";
			owner_lazy = () -> com.tools20022.repository.codeset.OpeningClosingCode.mmObject();
			codeName = "OPEP";
		}
	};
	final static private LinkedHashMap<String, OpeningClosingCode> codesByName = new LinkedHashMap<>();

	protected OpeningClosingCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CLOP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OpeningClosingCode";
				definition = "Specifies additional information relative to the processing of the trade.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OpeningClosingCode.ClosePosition, com.tools20022.repository.codeset.OpeningClosingCode.OpenPosition);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClosePosition.getCodeName().get(), ClosePosition);
		codesByName.put(OpenPosition.getCodeName().get(), OpenPosition);
	}

	public static OpeningClosingCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OpeningClosingCode[] values() {
		OpeningClosingCode[] values = new OpeningClosingCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OpeningClosingCode> {
		@Override
		public OpeningClosingCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OpeningClosingCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}