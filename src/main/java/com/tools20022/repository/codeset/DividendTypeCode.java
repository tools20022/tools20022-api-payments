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
import com.tools20022.repository.codeset.DividendTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the dividend.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DividendTypeCode#Cash
 * DividendTypeCode.mmCash}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DividendTypeCode#Units
 * DividendTypeCode.mmUnits}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DividendTypeCode#Scrip
 * DividendTypeCode.mmScrip}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DividendTypeCode#InKind
 * DividendTypeCode.mmInKind}</li>
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
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DividendTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature of the dividend."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DividendTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend is paid in cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendTypeCode
	 * DividendTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is paid in cash."</li>
	 * </ul>
	 */
	public static final DividendTypeCode Cash = new DividendTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Dividend is paid in cash.";
			owner_lazy = () -> com.tools20022.repository.codeset.DividendTypeCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Dividend is paid in units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendTypeCode
	 * DividendTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is paid in units."</li>
	 * </ul>
	 */
	public static final DividendTypeCode Units = new DividendTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Units";
			definition = "Dividend is paid in units.";
			owner_lazy = () -> com.tools20022.repository.codeset.DividendTypeCode.mmObject();
			codeName = "UNIT";
		}
	};
	/**
	 * Dividend is paid in the form of scrip.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendTypeCode
	 * DividendTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scrip"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is paid in the form of scrip."</li>
	 * </ul>
	 */
	public static final DividendTypeCode Scrip = new DividendTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Scrip";
			definition = "Dividend is paid in the form of scrip.";
			owner_lazy = () -> com.tools20022.repository.codeset.DividendTypeCode.mmObject();
			codeName = "SCRI";
		}
	};
	/**
	 * Dividend is paid in kind.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendTypeCode
	 * DividendTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KIND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InKind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is paid in kind."</li>
	 * </ul>
	 */
	public static final DividendTypeCode InKind = new DividendTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InKind";
			definition = "Dividend is paid in kind.";
			owner_lazy = () -> com.tools20022.repository.codeset.DividendTypeCode.mmObject();
			codeName = "KIND";
		}
	};
	final static private LinkedHashMap<String, DividendTypeCode> codesByName = new LinkedHashMap<>();

	protected DividendTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DividendTypeCode";
				definition = "Specifies the nature of the dividend.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DividendTypeCode.Cash, com.tools20022.repository.codeset.DividendTypeCode.Units, com.tools20022.repository.codeset.DividendTypeCode.Scrip,
						com.tools20022.repository.codeset.DividendTypeCode.InKind);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(Units.getCodeName().get(), Units);
		codesByName.put(Scrip.getCodeName().get(), Scrip);
		codesByName.put(InKind.getCodeName().get(), InKind);
	}

	public static DividendTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DividendTypeCode[] values() {
		DividendTypeCode[] values = new DividendTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DividendTypeCode> {
		@Override
		public DividendTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DividendTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}