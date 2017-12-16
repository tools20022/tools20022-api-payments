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
import com.tools20022.repository.codeset.QualityIndicationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the relative quality of the indication of interest.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QualityIndicationCode#Low
 * QualityIndicationCode.mmLow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QualityIndicationCode#Medium
 * QualityIndicationCode.mmMedium}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QualityIndicationCode#High
 * QualityIndicationCode.mmHigh}</li>
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
 * <li>"LOWE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QualityIndicationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the relative quality of the indication of interest."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QualityIndicationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Low quality.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualityIndicationCode
	 * QualityIndicationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOWE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Low"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Low quality."</li>
	 * </ul>
	 */
	public static final QualityIndicationCode Low = new QualityIndicationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Low";
			definition = "Low quality.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualityIndicationCode.mmObject();
			codeName = "LOWE";
		}
	};
	/**
	 * Medium quality.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualityIndicationCode
	 * QualityIndicationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Medium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium quality."</li>
	 * </ul>
	 */
	public static final QualityIndicationCode Medium = new QualityIndicationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Medium";
			definition = "Medium quality.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualityIndicationCode.mmObject();
			codeName = "MEDI";
		}
	};
	/**
	 * High quality.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QualityIndicationCode
	 * QualityIndicationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HIGH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "High"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "High quality."</li>
	 * </ul>
	 */
	public static final QualityIndicationCode High = new QualityIndicationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "High";
			definition = "High quality.";
			owner_lazy = () -> com.tools20022.repository.codeset.QualityIndicationCode.mmObject();
			codeName = "HIGH";
		}
	};
	final static private LinkedHashMap<String, QualityIndicationCode> codesByName = new LinkedHashMap<>();

	protected QualityIndicationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LOWE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QualityIndicationCode";
				definition = "Indicates the relative quality of the indication of interest.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QualityIndicationCode.Low, com.tools20022.repository.codeset.QualityIndicationCode.Medium, com.tools20022.repository.codeset.QualityIndicationCode.High);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Low.getCodeName().get(), Low);
		codesByName.put(Medium.getCodeName().get(), Medium);
		codesByName.put(High.getCodeName().get(), High);
	}

	public static QualityIndicationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QualityIndicationCode[] values() {
		QualityIndicationCode[] values = new QualityIndicationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QualityIndicationCode> {
		@Override
		public QualityIndicationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QualityIndicationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}