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
import com.tools20022.repository.codeset.SignatureTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of signature form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SignatureTypeCode#Original
 * SignatureTypeCode.mmOriginal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SignatureTypeCode#Digital
 * SignatureTypeCode.mmDigital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SignatureTypeCode#Electronic
 * SignatureTypeCode.mmElectronic}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SignatureTypeCode#None
 * SignatureTypeCode.mmNone}</li>
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
 * <li>"ORIG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SignatureTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of signature form."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SignatureTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The investor's written signature is required. Can also be known as
	 * physical or wet signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureTypeCode
	 * SignatureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Original"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The investor's written signature is required. Can also be known as physical or wet signature."
	 * </li>
	 * </ul>
	 */
	public static final SignatureTypeCode Original = new SignatureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Original";
			definition = "The investor's written signature is required. Can also be known as physical or wet signature.";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureTypeCode.mmObject();
			codeName = "ORIG";
		}
	};
	/**
	 * A technical signature that includes algorithms and private key and public
	 * key information. Used to sign and verify the contents of a message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureTypeCode
	 * SignatureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIGI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Digital"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A technical signature that includes algorithms and private key and public key information. Used to sign and verify the contents of a message."
	 * </li>
	 * </ul>
	 */
	public static final SignatureTypeCode Digital = new SignatureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Digital";
			definition = "A technical signature that includes algorithms and private key and public key information. Used to sign and verify the contents of a message.";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureTypeCode.mmObject();
			codeName = "DIGI";
		}
	};
	/**
	 * A copy of a physical or orignal signature in an electronic format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureTypeCode
	 * SignatureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Electronic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A copy of a physical or orignal signature in an electronic format."</li>
	 * </ul>
	 */
	public static final SignatureTypeCode Electronic = new SignatureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Electronic";
			definition = "A copy of a physical or orignal signature in an electronic format.";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureTypeCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * There is no signature required in any form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureTypeCode
	 * SignatureTypeCode}</li>
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
	 * definition} = "There is no signature required in any form."</li>
	 * </ul>
	 */
	public static final SignatureTypeCode None = new SignatureTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			definition = "There is no signature required in any form.";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureTypeCode.mmObject();
			codeName = "NONE";
		}
	};
	final static private LinkedHashMap<String, SignatureTypeCode> codesByName = new LinkedHashMap<>();

	protected SignatureTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ORIG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SignatureTypeCode";
				definition = "Type of signature form.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SignatureTypeCode.Original, com.tools20022.repository.codeset.SignatureTypeCode.Digital, com.tools20022.repository.codeset.SignatureTypeCode.Electronic,
						com.tools20022.repository.codeset.SignatureTypeCode.None);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Original.getCodeName().get(), Original);
		codesByName.put(Digital.getCodeName().get(), Digital);
		codesByName.put(Electronic.getCodeName().get(), Electronic);
		codesByName.put(None.getCodeName().get(), None);
	}

	public static SignatureTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SignatureTypeCode[] values() {
		SignatureTypeCode[] values = new SignatureTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SignatureTypeCode> {
		@Override
		public SignatureTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SignatureTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}